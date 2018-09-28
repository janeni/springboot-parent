package com.sunjx.relational.command;

/**
 * Auther: jx
 * Date: 2018/9/27
 * Time: 14:54
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
