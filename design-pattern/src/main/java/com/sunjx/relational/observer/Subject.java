package com.sunjx.relational.observer;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 15:11
 */
public interface Subject {
    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void  notifyObservers();

    /*自身的操作*/
    public void operation();
}
