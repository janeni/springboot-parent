package com.sunjx.relational.observer;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 15:08
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received!");
    }
}
