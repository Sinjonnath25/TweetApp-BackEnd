package com.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Sinjon Nath
 *
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2
public class TweetappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetappApplication.class, args);
	}

}
