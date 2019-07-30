package com.leyou.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableConfigurationProperties(CorsProperties.class)
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter(CorsProperties prop){
        CorsConfiguration config = new CorsConfiguration();
        //允许跨域的域名
        prop.getAllowedOrigins().forEach(config::addAllowedOrigin);
        //是否允许携带cookie
        config.setAllowCredentials(prop.getAllowedCredentials());
        //被允许的头信息
        prop.getAllowedHeaders().forEach(config::addAllowedHeader);
        //被允许的方法
        prop.getAllowedMethods().forEach(config::addAllowedMethod);
        //设置最大有效时间
        config.setMaxAge(prop.getMaxAge());
        //设置拦截的路径
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(prop.getFilterPath(),config);
        return new CorsFilter(source);

    }
}
