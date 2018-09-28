package com.sunjx.relational.strategy1simplefactory;

/**
 * Auther: jx
 * Date: 2018/9/7
 * Time: 17:07
 */
@PriceRegion(min=30000)
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice*0.7;
    }
}
