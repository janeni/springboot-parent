package com.sunjx.relational.observer;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 15:07
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received!");
    }

}
