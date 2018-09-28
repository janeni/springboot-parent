package com.sunjx.relational.templatemethod;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 14:23
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
