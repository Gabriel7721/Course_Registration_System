package com.iuh.kttkpm.be.lookUpPoints;

import com.iuh.kttkpm.be.lookUpPoints.models.Faculty;
import com.iuh.kttkpm.be.lookUpPoints.repositories.FacultyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LookUpPointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LookUpPointsApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry
						.addMapping("/**")
						.allowedMethods("*")
						.allowedOrigins("*")
						.allowedHeaders("*");
			}
		};
	}

}
