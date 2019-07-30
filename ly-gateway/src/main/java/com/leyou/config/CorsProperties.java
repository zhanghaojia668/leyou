package com.leyou.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("ly.cors")
public class CorsProperties {
    private List<String> allowedOrigins;
    private Boolean allowedCredentials;
    private List<String> allowedHeaders;
    private List<String> allowedMethods;
    private Long maxAge;
    private String filterPath;
}
