package com.example.hellorestworld.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.hellorestworld.PackageInfo;
import com.example.hellorestworld.config.SwaggerConfig;

@Configuration
@Import(SwaggerConfig.class)
@ComponentScan(basePackageClasses = { PackageInfo.class })
public class MainConfig {

}
