package com.example.library.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.example.library.controller")
public class SwaggerConfig {

    @Bean
    public Docket createSwaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                //设定Api文档头信息，这个信息会展示在文档UI的头部位置
                .apiInfo(swaggerApiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/error.*")))//错误路径不监控
                .paths(PathSelectors.regex("/.*"))// 对根下所有路径进行监控
                .build();
    }

    private ApiInfo swaggerApiInfo(){
        //构建联系实体，在UI界面会显示
        Contact contact = new Contact("吴耀恩", "","1024703384@qq.com");
        return new ApiInfoBuilder().contact(contact)
                //文档标题
                .title("大作业API")
                //文档描述
                .description("大作业微信图书馆小程序API文档")
                //文档版本
                .version("1.0.0")
                .build();
    }
}
