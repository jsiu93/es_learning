//package com.xzh;
//
//import org.elasticsearch.action.get.GetResponse;
//import org.elasticsearch.client.transport.TransportClient;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EsSpringTest {
//
//	@Autowired
//	private TransportClient client;
//	
//	@Test
//	public void getAll() {
//		
//		GetResponse r = this.client.prepareGet().get();
//		System.err.println(r.getSourceAsString());
//	}
//
//}
