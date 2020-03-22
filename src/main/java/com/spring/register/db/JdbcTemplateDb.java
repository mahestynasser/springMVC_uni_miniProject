package com.spring.register.db;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcTemplateDb extends JdbcTemplate {

	@Override
	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

}
