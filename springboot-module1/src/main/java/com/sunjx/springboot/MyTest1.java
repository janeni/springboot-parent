package com.sunjx.springboot;


import com.sunjx.springboot.utils.DateUtils;
import org.springframework.beans.factory.serviceloader.ServiceFactoryBean;

/**
 * Created by jx on 2018/6/11.
 */
public class MyTest1 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        //ServiceFactory
        String format= DateUtils.getCurrentDateByFormat("20180611");
        System.out.println(format);
    }
}
