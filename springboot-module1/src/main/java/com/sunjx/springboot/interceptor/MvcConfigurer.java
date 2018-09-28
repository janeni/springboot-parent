package com.sunjx.springboot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by jx on 2018/6/12.
 */
@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    //拦截器
    public void addInterceptors(InterceptorRegistry registry){
        //增加一个拦截器，检查回话，URL以admin开头的都使用此拦截器
        registry.addInterceptor(new SessionHandlerInterceptor()).addPathPatterns("/admin/**");

    }
    //跨域访问配置
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://domains.com")
                .allowedMethods("POST","GET");

    }
    //格式化
    public void addFormatters(FormatterRegistry registry){
        registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));

    }
    //URI到视图映射
    public void addViewControllers(ViewControllerRegistry registry){
        //对于index.html的请求，设置返回的视图为index.btl
        //所有以.do结尾的请求重定向到/index.html请求

    }
}
