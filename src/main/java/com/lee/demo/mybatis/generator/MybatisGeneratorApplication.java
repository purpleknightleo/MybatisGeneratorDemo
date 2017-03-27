package com.lee.demo.mybatis.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 需要使用@MapperScan来指定Mapper类的包路径
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lee.demo.mybatis.generator.dao.mapper")
public class MybatisGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisGeneratorApplication.class, args);
	}
}
