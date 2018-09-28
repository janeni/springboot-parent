package com.sunjx.relational.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 15:38
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector=new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> emumo=vector.elements();
        while (emumo.hasMoreElements()){
            emumo.nextElement().update();;
        }
    }
}
