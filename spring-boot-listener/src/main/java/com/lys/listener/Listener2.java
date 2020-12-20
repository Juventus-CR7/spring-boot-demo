package com.lys.listener;

import com.lys.event.TestEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Listener2 implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent event) {
        event.printMsg("listener2监听到了");
    }
}
