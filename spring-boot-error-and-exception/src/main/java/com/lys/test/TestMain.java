package com.lys.test;

import com.lys.domain.Person;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class TestMain {
    public static void main(String[] args) {
        //通过Validation创建一个validator实例
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        //创建一个不符合要求的bean
        Person person = new Person("","");
        //开始验证 接收验证结果
        Set<ConstraintViolation<Person>> validates = validator.validate(person);
        for(ConstraintViolation violation : validates){
            System.out.println(violation.getPropertyPath()+","+violation.getMessage());
        }
    }
}
