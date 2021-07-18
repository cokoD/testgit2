package com.example.springbootweb.Config;

import com.example.springbootweb.Interceptor.MyIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfigureation implements WebMvcConfigurer {

    @Autowired
    private MyIntercepter myIntercepter;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myIntercepter).addPathPatterns("/**");
    }
}
