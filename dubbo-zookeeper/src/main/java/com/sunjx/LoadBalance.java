package com.sunjx;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.List;

/**
 * Auther: jx
 * Date: 2018/9/4
 * Time: 18:09
 */
public interface LoadBalance {
    String selectHost(List<String> serviceRepos);
}
