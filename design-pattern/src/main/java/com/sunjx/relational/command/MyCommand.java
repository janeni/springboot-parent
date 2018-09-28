package com.sunjx.relational.command;

/**
 * Auther: jx
 * Date: 2018/9/27
 * Time: 14:48
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
