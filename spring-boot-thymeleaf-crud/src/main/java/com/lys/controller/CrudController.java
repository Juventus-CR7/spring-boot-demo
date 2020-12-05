package com.lys.controller;

import com.lys.domain.Worker;
import com.lys.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrudController {
    @Autowired
    private CrudService service;

    @RequestMapping("/select")
    public String selectList(Model model){
        model.addAttribute("workerList",service.select());
        return "index";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Worker worker){
        service.add(worker);
        return "redirect:select";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model,String name){
        model.addAttribute("worker",service.selectWorker(name));
        return "update";
    }

    @RequestMapping("/update")
    public String update(Worker worker){
        service.update(worker);
        return "redirect:select";
    }

    @RequestMapping("/toDelete")
    public String delete(String name){
        service.delete(name);
        return "redirect:select";
    }
}
