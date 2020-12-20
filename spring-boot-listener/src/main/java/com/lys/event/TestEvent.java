package com.lys.event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
    public TestEvent(Object msg){
        super(msg);
    }

    public void printMsg(String msg){
        System.out.println("自定义事件，打印的信息为：" + msg);
    }
}
