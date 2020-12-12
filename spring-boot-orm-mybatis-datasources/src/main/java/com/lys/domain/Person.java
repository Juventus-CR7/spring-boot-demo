package com.lys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Person {
    private Integer pid;
    private String pname;
    private String cardid;
}
