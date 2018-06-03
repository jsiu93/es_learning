//package com.xzh.config;
//
//import java.net.InetAddress;
//
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MyConfig {
//
//	@Bean
//	public TransportClient client() throws Exception {
//		// 设置端口名字
//		InetSocketTransportAddress node = new InetSocketTransportAddress(InetAddress.getByName("10.211.55.12"), 9300);
//		// 设置名字
//		Settings settings = Settings.builder().put("cluster.name", "elasticsearch").build();
//
//		TransportClient client = new PreBuiltTransportClient(settings);
//		client.addTransportAddress(node);
//		return client;
//	}
//}
