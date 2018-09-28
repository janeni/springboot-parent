package com.sunjx.relational.Iterator;


/**
 * Auther: jx
 * Date: 2018/9/26
 * Time: 16:44
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
