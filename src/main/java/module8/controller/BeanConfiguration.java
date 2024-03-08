package module8.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import module8.beans.Company;
import module8.beans.JobOpenings;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Company company() {
		Company bean = new Company();
		return bean;
	}

	@Bean
	public JobOpenings jobOpenings() {
		JobOpenings bean = new JobOpenings();
		return bean;
	}
}
