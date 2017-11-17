package com.springboot.demo.web;

import com.springboot.demo.web.filter.CustomFilter;
import com.springboot.demo.web.listener.WebAppListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ServletComponentScan
public class SpringbootWebApplication {

	/**
	 *注册拦截器取代在web.xml中注册Filter
	 * @return
	 */
	@Bean
	public FilterRegistrationBean customFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setName("CustomFilter");
		CustomFilter customFilter = new CustomFilter();
		registrationBean.setFilter(customFilter);
		registrationBean.setOrder(-1);
		List<String> urlList = new ArrayList<>();
		urlList.add("/user/*");
		registrationBean.setUrlPatterns(urlList);
		return registrationBean;
	}

	/**
	 * 注册WebAppListener取代web.xml中注册Listener节点操作
	 */
	@Bean
	public ServletListenerRegistrationBean<WebAppListener> servletListenerRegistrationBean() {
		ServletListenerRegistrationBean<WebAppListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
		servletListenerRegistrationBean.setListener(new WebAppListener());
		return servletListenerRegistrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
}
