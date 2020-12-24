package com.lys.controller;

import com.lys.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping
    @ResponseBody
    public String test(@Valid Person person, BindingResult result){
        if(result.getErrorCount() > 0){
            List<FieldError> fieldErrors = result.getFieldErrors();
            StringBuilder builder = new StringBuilder();
            for(FieldError fieldError : fieldErrors){
                builder.append(fieldError.getField());
                builder.append("\t");
                builder.append(fieldError.getDefaultMessage());
                builder.append("\n");
            }
            return builder.toString();
        }
        return "fail";
    }
}
