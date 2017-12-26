package com.endless.config;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = { "com.endless" }, excludeFilters = {
	@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
@MapperScan(basePackages = { "com.endless.dao" })
public class RootConfig {

    @Bean
    public SqlSessionFactory getSqlSessionFactory() {
	System.out.println("配置数据源");
	DriverManagerDataSource DataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/test", "root",
		"root");
	DataSource.setDriverClassName("com.mysql.jdbc.Driver");
	System.out.println("加载数据库驱动");
	TransactionFactory transactionFactory = new JdbcTransactionFactory();
	Environment environment = new Environment("development", transactionFactory, DataSource);
	org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration(environment);
	System.out.println("配置sqlSessionFactory");
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
	// sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
	return sqlSessionFactory;
    }

}