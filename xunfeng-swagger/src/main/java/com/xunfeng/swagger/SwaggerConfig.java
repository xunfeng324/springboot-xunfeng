package com.xunfeng.swagger;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class SwaggerConfig implements EnvironmentAware {
    private String title;// 标题
    private String description; // 描述
    private String version; // 版本
    private String termsOfServiceUrl; // 组织链接
    private String license;// 许可
    private String licenseUrl; // 许可连接
    private String isEnable; // 是否开启文档

    @Bean //配置docket以配置Swagger具体参数
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(isEnable.equals("1"))//配置是否开启文档
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.xunfeng.controller"))
                .build();
    }
  /*  @Bean
    public UiConfigurationBuilder uiConfigurationBuilder(){
        return UiConfigurationBuilder.builder()
                .deepLinking(false)
                .defaultModelExpandDepth(0);
    }*/


    //配置文档信息
    private ApiInfo apiInfo() {

        return new ApiInfo(
                title,
                description,
                version,
                termsOfServiceUrl,
                new Contact("", "", ""),  // 联系人信息
                license,
                licenseUrl,
                new ArrayList<>()// 扩展
        );
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.title = environment.getProperty("swagger.title");
        this.description = environment.getProperty("swagger.description");
        this.version = environment.getProperty("swagger.version");
        this.termsOfServiceUrl = environment.getProperty("swagger.termsOfServiceUrl");
        this.license = environment.getProperty("swagger.license");
        this.licenseUrl = environment.getProperty("swagger.licenseUrl");
        this.isEnable = environment.getProperty("swagger.isEnable");
    }
}

