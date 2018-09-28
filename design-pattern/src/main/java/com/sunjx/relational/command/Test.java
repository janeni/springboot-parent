package com.sunjx.relational.command;

/**
 * Auther: jx
 * Date: 2018/9/27
 * Time: 15:04
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command cmd=new MyCommand(receiver);
        Invoker invoker=new Invoker(cmd);
        invoker.action();
    }
}
