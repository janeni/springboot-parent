package com.sunjx.relational.strategy1simplefactory;

/**
 * Auther: jx
 * Date: 2018/9/7
 * Time: 17:05
 */
public interface CalPrice {
    //根据原价返回一个最终的价格
    Double calPrice(Double orgnicPrice);
}
