package com.bikkadit.MakeMyTrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MakeMyTripApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeMyTripApplication.class, args);
	}
	
	@Bean
	public WebClient.Builder getWebClient(){
		return WebClient.builder();
	}
	
	

}
