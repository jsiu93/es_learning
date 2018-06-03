package com.xzh;

import java.net.InetAddress;
import java.util.List;

import org.elasticsearch.action.get.GetRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xzh.entity.Film;
import com.xzh.mapper.FilmMapper;
import com.xzh.util.FastJsonConvertUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsLearningApplicationTests {

	private static String host = "10.211.55.12"; //
	private static int port = 9300; //

	public static final String CLUSTER_NAME = "elasticsearch";

	public static final String ANALYZER = "ik_max_word";

	private static Settings.Builder settings = Settings.builder().put("cluster.name", CLUSTER_NAME);

	private TransportClient client = null;

	@Before
	public void getCient() throws Exception {
		client = new PreBuiltTransportClient(settings.build())
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), port));
	}

	@After
	public void close() {
		if (client != null) {
			client.close();
		}
	}

	@Test
	public void getById() {
		GetRequestBuilder result = this.client.prepareGet("film", "recent", "1");
		System.err.println(result.get().getSourceAsString());
	}

	@Autowired
	private FilmMapper filmMapper;

	@Test
	public void prepare() {
		List<Film> list = this.filmMapper.selectAll();
		// this.client.prepareIndex("book", "novel")
		// .setSource(builder).get();
		for (Film film : list) {
			IndexResponse response = client.prepareIndex("film", "recent")
					.setSource(FastJsonConvertUtil.convertObjectToJSONObject(film), XContentType.JSON).get();
			System.out.println("类型：" + response.getType());
			System.out.println("文档ID：" + response.getId());
			// System.err.println(FastJsonConvertUtil.convertObjectToJSONObject(film));
		}
	}

	/**
	 * 分词查询
	 */
	@Test
	public void search() {
		SearchRequestBuilder srb = this.client.prepareSearch("film").setTypes("recent");
		HighlightBuilder highlightBuilder = new HighlightBuilder();
		highlightBuilder.preTags("<h2><font>");
		highlightBuilder.postTags("</font></h2>");
		highlightBuilder.field("popularComments");
		SearchResponse sr = srb.setQuery(QueryBuilders.matchQuery("popularComments", "烂片").analyzer(ANALYZER))
				.setFetchSource(new String[] { "title", "aka", "popularComments" }, null).highlighter(highlightBuilder)
				.execute().actionGet();
		SearchHits hits = sr.getHits();
		for (SearchHit searchHit : hits) {
			System.err.println(searchHit.getSourceAsString());
			System.out.println(searchHit.getHighlightFields());
		}
	}

	/**
	 * 多字段分词查询
	 * 
	 * @throws Exception
	 */
	@Test
	public void search2() throws Exception {
		SearchRequestBuilder srb = client.prepareSearch("film").setTypes("recent");
		HighlightBuilder highlightBuilder = new HighlightBuilder();
		highlightBuilder.preTags("<h2><font>");
		highlightBuilder.postTags("</font></h2>");
		highlightBuilder.field("title");
		SearchResponse sr = srb.setQuery(QueryBuilders.multiMatchQuery("星球 丛林", "title").analyzer("ik_max_word"))
				.setFetchSource(new String[] { "title", "aka" }, null).highlighter(highlightBuilder).execute().actionGet();
		SearchHits hits = sr.getHits();
		for (SearchHit hit : hits) {
			System.out.println(hit.getHighlightFields());
			System.err.println(hit.getSourceAsString());
		}
	}
	
	@Test
	public void searchByPhrase() {
		SearchRequestBuilder srb = client.prepareSearch("film").setTypes("recent");
		
		HighlightBuilder highlightBuilder = new HighlightBuilder();
		highlightBuilder.preTags("<h2><font>");
		highlightBuilder.postTags("</font></h2>");
		highlightBuilder.field("popularComments");
		
		BoolQueryBuilder qb = QueryBuilders.boolQuery().must(new QueryStringQueryBuilder("烂片").field("popularComments"));
		SearchResponse sr = srb.setQuery(qb).highlighter(highlightBuilder).execute().actionGet();
		SearchHits hits = sr.getHits();
		for (SearchHit searchHit : hits) {
			System.err.println(searchHit.getHighlightFields());
			System.err.println(searchHit.getSourceAsString());
		}
	}

}
