package com.lys.listener;

import com.lys.event.TestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener3 {

    @EventListener
    public void eventListener(TestEvent event){
        event.printMsg("listener3监听到了");
    }
}
