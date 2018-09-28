package com.sunjx;

import org.springframework.util.StringUtils;

import java.io.File;

/**
 * Auther: jx
 * Date: 2018/9/7
 * Time: 14:00
 */
public class TestPath {
    public static void main(String[] args) {
        String path="F:\\20190907";
        File file=new File(path);
        if(!file.exists()){
            file.mkdir();
        }
    }
}
