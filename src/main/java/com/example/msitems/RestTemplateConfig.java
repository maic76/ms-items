package com.example.msitems;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean //inyectamos un Rest Template
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
