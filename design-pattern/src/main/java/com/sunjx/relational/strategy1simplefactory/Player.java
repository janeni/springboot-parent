package com.sunjx.relational.strategy1simplefactory;

/**
 * Auther: jx
 * Date: 2018/9/7
 * Time: 17:08
 */
public class Player {
    private Double totalAmount = 0D;//客户在鹅厂消费的总额
    private Double amount = 0D;//客户单次消费金额
    private CalPrice calPrice = new Orgnic();//每个客户都有一个计算价格的策略，初始都是普通计算，即原价

    //客户购买皮肤，就会增加它的总额
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        //初始方法 需要if判断
//        if (totalAmount > 30000) {//30000则改为金牌会员计算方式
//            calPrice = new GoldVip();
//        } else if (totalAmount > 20000) {//类似
//            calPrice = new SuperVip();
//        } else if (totalAmount > 10000) {//类似
//            calPrice = new Vip();
//        }
        //用简单工厂规避if
        /* 变化点，我们将策略的制定转移给了策略工厂，将这部分责任分离出去 */
        calPrice = CalPriceFactory.createCalPrice(this);
    }

    //计算客户最终要付的钱
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}