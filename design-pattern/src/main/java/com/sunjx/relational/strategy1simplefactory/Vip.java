package com.sunjx.relational.strategy1simplefactory;

/**
 * Auther: jx
 * Date: 2018/9/7
 * Time: 17:05
 */
@PriceRegion(max = 20000)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice*0.9;
    }
}