package com.lys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data @AllArgsConstructor
public class Person {
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "{person.age.notblank}")
    private String age;
}
