package com.lys.service;

import com.lys.domain.Person;
import com.lys.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonMapper mapper;

    public List<Person> selectList(){
        return mapper.selectList();
    }
}
