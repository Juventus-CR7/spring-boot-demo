package com.lys.service;

import com.lys.dao1.PersonDao1;
import com.lys.dao2.PersonDao2;
import com.lys.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao1 dao1;
    @Autowired
    private PersonDao2 dao2;

    public List<Person> selectAll(){
//        return dao1.selectAll();
        return dao2.selectAll();
    }
}
