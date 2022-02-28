package com.gylaroid.bashorgCrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BashorgCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BashorgCrawlerApplication.class, args);
	}

}
