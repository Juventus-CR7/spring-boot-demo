package com.lys.listener;

import com.lys.event.TestEvent;
import org.springframework.context.ApplicationListener;

public class Listener4 implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent event) {
        event.printMsg("listener4监听到了");
    }
}
