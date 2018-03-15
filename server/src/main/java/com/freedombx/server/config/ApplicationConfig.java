package com.freedombx.server.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 应用全局配置
 */
@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        ThymeleafAutoConfiguration.class, FreeMarkerAutoConfiguration.class, SecurityAutoConfiguration.class})
@ComponentScan(basePackages = "com.freedombx", excludeFilters = {})
@EnableSwagger2
public class ApplicationConfig {
}
