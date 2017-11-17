package com.springboot.demo.web.config;

import com.springboot.demo.web.interceptor.CustomInterceptor1;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
   使用AppWebMvcConfigurer类取代配置文件

 */
@Configuration
public class AppWebMvcConfigurer extends WebMvcConfigurerAdapter {

    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        registry.addInterceptor(new CustomInterceptor1())
                .excludePathPatterns("/velocity/*")    //排除的URL模式
                .addPathPatterns("/freemark/*");       //拦截的URL模式
        super.addInterceptors(registry);
    }



}
