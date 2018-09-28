package com.sunjx.relational.Iterator;

/**
 * Auther: jx
 * Date: 2018/9/27
 * Time: 11:12
 */
public class Test {

    public static void main(String[] args) {
        Collection collection=new MyCollection();
        Iterator iterator= collection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
