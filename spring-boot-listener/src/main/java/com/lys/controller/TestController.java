package com.lys.controller;

import com.lys.event.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/listener")
public class TestController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    @ResponseBody
    public String test(){
        publisher.publishEvent(new TestEvent(this));
        return "成功";
    }
}
