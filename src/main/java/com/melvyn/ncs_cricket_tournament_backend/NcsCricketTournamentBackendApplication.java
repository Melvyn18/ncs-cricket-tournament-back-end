package com.melvyn.ncs_cricket_tournament_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class NcsCricketTournamentBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcsCricketTournamentBackendApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("*")
						.allowedOrigins(
								"http://192.168.0.226:5010",
								"http://localhost:3000",
								"http://192.168.0.166:3000");
			}
		};
	}
}
