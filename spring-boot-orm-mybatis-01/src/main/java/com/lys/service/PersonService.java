package com.lys.service;

import com.lys.dao.PersonDao;
import com.lys.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao dao;

    public List<Person> selectAll(){
        return dao.selectAll();
    }
}
