package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.wnameless.spring.bulkapi.BulkApiService;
import com.github.wnameless.spring.bulkapi.DefaultBulkApiService;
import com.github.wnameless.spring.bulkapi.EnableBulkApi;

@Configuration
@EnableBulkApi
public class BulkConfig {

	@Autowired
	@Bean
	public BulkApiService bulkApiService(ApplicationContext appCtx) {
		return new DefaultBulkApiService(appCtx);
	}
}