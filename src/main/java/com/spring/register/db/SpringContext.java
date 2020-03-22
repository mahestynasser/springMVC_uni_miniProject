package com.spring.register.db;

import javax.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware {

	public static ApplicationContext applicationContext;

	public static JdbcTemplate template;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContext.applicationContext = applicationContext;

	}

	@PostConstruct
	public void init() {
		template = applicationContext.getBean(JdbcTemplateDb.class);
		System.out.println("template");
	}

}
