package com.cloud.base.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {
	
	/**
     * 定义api组，
     */
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cloud"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("中益善源 Spring Boot Restful APIs")
                .version("1.0")
                .build();
    }
    
//    @Bean
//    public Docket innerApi() {
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("innerApi")
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.cloud"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(innerApiInfo());
//    }
//
////    @Bean
////    public Docket openApi() {
////        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
////            @Override
////            public boolean apply(RequestHandler input) {
////                if (input.isAnnotatedWith(ApiOperation.class))//只有添加了ApiOperation注解的method才在API中显示
////                    return true;
////                return false;
////            }
////        };
////        return new Docket(DocumentationType.SWAGGER_2)
////                .groupName("openApi")
////                .genericModelSubstitutes(DeferredResult.class)
////                .useDefaultResponseMessages(false)
////                .forCodeGeneration(false)
////                .select()
////                .apis(predicate)
////                .paths(PathSelectors.any())//过滤的接口
////                .build()
////                .apiInfo(openApiInfo());
////    }
//
//    private ApiInfo innerApiInfo() {
//        return new ApiInfoBuilder()
//                .title("进件系统")//大标题
//                .description("内部api")//详细描述
//                .version("1.0")//版本
//                .termsOfServiceUrl("NO terms of service")
//                .contact(new Contact("金", "https://www.baidu.com", "787591269@qq.com"))//作者
//                .license("你的指尖拥有改变世界的力量")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .build();
//    }
//
//    private ApiInfo openApiInfo() {
//        return new ApiInfoBuilder()
//                .title("进件系统")//大标题
//                .description("进件团队提供 ~ 对外的api文档")//详细描述
//                .version("1.0")//版本
//                .termsOfServiceUrl("NO terms of service")
//                .contact(new Contact("dengfu","www.baidu.com", "787591269@qq.com"))//作者
//                .license("你的指尖拥有改变世界的力量")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .build();
//    }
    
}

