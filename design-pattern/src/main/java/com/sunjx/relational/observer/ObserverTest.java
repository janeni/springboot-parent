package com.sunjx.relational.observer;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 15:45
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub=new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
