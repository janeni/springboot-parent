package com.sunjx.relational.chainofresponsibility;

/**
 * Auther: jx
 * Date: 2018/9/27
 * Time: 11:32
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler=handler;
    }
}
