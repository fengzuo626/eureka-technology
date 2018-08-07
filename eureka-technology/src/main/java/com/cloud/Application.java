package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author FengZuo
 * @time 下午2:20:21
 */
@EnableEurekaServer
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages ="com.cloud.dao.*.mapper")
@ComponentScan(basePackages="com.cloud")
@SwaggerDefinition
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
