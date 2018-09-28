package com.sunjx.relational.observer;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 15:44
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
