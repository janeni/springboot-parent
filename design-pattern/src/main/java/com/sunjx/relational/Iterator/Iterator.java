package com.sunjx.relational.Iterator;

/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 16:56
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();

    public boolean hasNext();
    //取得第一个元素
    public Object first();
}
