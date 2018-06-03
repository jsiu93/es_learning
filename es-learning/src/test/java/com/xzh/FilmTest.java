package com.xzh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xzh.entity.Film;
import com.xzh.film.vo.Casts;
import com.xzh.film.vo.Directors;
import com.xzh.film.vo.Entries;
import com.xzh.film.vo.MovieItemVO;
import com.xzh.film.vo.PopularComments;
import com.xzh.film.vo.RecentMovieVO;
import com.xzh.film.vo.Writers;
import com.xzh.mapper.FilmMapper;
import com.xzh.util.FastJsonConvertUtil;
import com.xzh.util.HttpClientUtil;
import com.xzh.util.KeyUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmTest {
	
	@Autowired
	private FilmMapper filmMapper;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getAll() {
		List<Film> list = this.filmMapper.selectAll();
		System.err.println(list.size());
	}
	
	@Test
	public void getRecent() {
		String url = "http://api.douban.com/v2/movie/nowplaying?apikey=0df993c66c0c636e29ecbb5344252a4a";
		String result = HttpClientUtil.doGet(url);
		
		RecentMovieVO vo = FastJsonConvertUtil.convertJSONToObject(result, RecentMovieVO.class);
		List<Entries> entries = vo.getEntries();
		for (Entries entries2 : entries) {
			System.err.println(entries2.getId());
		}
		
	}
	
	@Test
	public void parseRecent29() throws IOException, InterruptedException {
		
		String url = "http://api.douban.com/v2/movie/nowplaying?apikey=0df993c66c0c636e29ecbb5344252a4a";
		String result = HttpClientUtil.doGet(url);
		List<String> ids = new ArrayList<>();
		RecentMovieVO vo1 = FastJsonConvertUtil.convertJSONToObject(result, RecentMovieVO.class);
		List<Entries> entries = vo1.getEntries();
		for (Entries entries2 : entries) {
			System.err.println(entries2.getId());
			ids.add(entries2.getId());
		}
		
		String baseUrl = "https://api.douban.com/v2/movie/subject/";
		Map<String, String> params = new HashMap<>();
		params.put("apikey", "0df993c66c0c636e29ecbb5344252a4a");
		
//		List<String> lines = FileUtils.readLines(new File("C:\\Users\\siu\\Documents\\Nut\\important\\recent29.txt"));
		int successCount = 0;
		int failCount = 0;
		for (String itemId : ids) {
//			Thread.sleep(1500);
			String requestUrl = baseUrl + itemId;
			System.err.println(requestUrl);
			
			String r = HttpClientUtil.doGet(requestUrl, params);
			
			MovieItemVO vo = FastJsonConvertUtil.convertJSONToObject(r, MovieItemVO.class);
			
			Film film = new Film();
			film.setId(KeyUtil.generatorUUID());
			film.setItemId(itemId);
			film.setTitle(vo.getTitle());
			film.setOriginalTitle(vo.getOriginalTitle());
			film.setAlt(vo.getAlt());
			film.setWishCount(vo.getWishCount());
			film.setSummary(vo.getSummary());
			film.setYear(vo.getYear());
			film.setSubtype(vo.getSubtype());
			film.setPubdate(vo.getPubdate());
			film.setMainlandPubdate(vo.getMainlandPubdate());
			
			film.setRatingsCount(vo.getRatingsCount());
			film.setMax(vo.getRating().getMax());
			film.setMin(vo.getRating().getMin());
			film.setAverage(vo.getRating().getAverage());
			film.setStars(vo.getRating().getStars()); 
			
			film.setReviewsCount(vo.getReviewsCount());
			film.setCollectCount(vo.getCollectCount());
			film.setCommentsCount(vo.getCommentsCount());
			
			if (CollectionUtils.isNotEmpty(vo.getDurations())) {
				film.setDurations(vo.getDurations().get(0));
			}
			
			
			List<String> aka = vo.getAka();
			if (CollectionUtils.isNotEmpty(aka)) {
				String akaStr = StringUtils.join(aka, " ");
				film.setAka(akaStr);
			}
			
			List<String> lang = vo.getLanguages();
			if (CollectionUtils.isNotEmpty(lang)) {
				String akaStr = StringUtils.join(lang, " ");
				film.setLanguages(akaStr);
			}
			
			List<Casts> casts = vo.getCasts();
			if (CollectionUtils.isNotEmpty(casts)) {
				List<String> s = new ArrayList<>();
				for (Casts cast : casts) {
					String name = cast.getName();
					if (StringUtils.isNotEmpty(cast.getNameEn())) {
						name = name + "(" + cast.getNameEn() + ")";
					}
					s.add(name);
				}
				film.setCasts(StringUtils.join(s, " "));
			}
			
			List<String> countries = vo.getCountries();
			if (CollectionUtils.isNotEmpty(countries)) {
				film.setCountries(StringUtils.join(countries, " "));
			}
			
			List<String> genres = vo.getGenres();
			if (CollectionUtils.isNotEmpty(genres)) {
				film.setGenres(StringUtils.join(genres, " "));
			}
			
			List<String> tags = vo.getTags();
			if (CollectionUtils.isNotEmpty(tags)) {
				film.setTags(StringUtils.join(tags, " "));
			}
			
			List<Directors> directors = vo.getDirectors();
			if (CollectionUtils.isNotEmpty(directors)) {
				List<String> s = new ArrayList<>();
				for (Directors cast : directors) {
					String name = cast.getName();
					if (StringUtils.isNotEmpty(cast.getNameEn())) {
						name = name + "(" + cast.getNameEn() + ")";
					}
					s.add(name);
				}
				film.setDirectors(StringUtils.join(s, " "));
			}
			
			List<PopularComments> popularComments = vo.getPopularComments();
			if (CollectionUtils.isNotEmpty(popularComments)) {
				List<String> s = new ArrayList<>();
				for (PopularComments cast : popularComments) {
					s.add(cast.getContent());
				}
				film.setPopularComments(StringUtils.join(s, "|"));
			}
			
			List<Writers> writers = vo.getWriters();
			if (CollectionUtils.isNotEmpty(writers)) {
				List<String> s = new ArrayList<>();
				for (Writers cast : writers) {
					String name = cast.getName();
					if (StringUtils.isNotEmpty(cast.getNameEn())) {
						name = name + "(" + cast.getNameEn() + ")";
					}
					s.add(name);
				}
				film.setWriters(StringUtils.join(s, " "));
			}
			film.setCtime(new Date());
			System.err.println(FastJsonConvertUtil.convertObjectToJSON(film));
			
			try {
				successCount += this.filmMapper.insert(film);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("当前成功数:" + successCount + "total: " + ids.size());
		}
		System.err.println("总条目：" + ids.size());
		System.err.println("总成功条目：" + successCount);
		System.err.println("总失败条目：" + failCount);
		
	}
	
	@Test
	public void get(){
		List<Film> list = this.filmMapper.selectAll();
		System.err.println(FastJsonConvertUtil.convertObjectToJSON(list.get(0)));
	}

}
