package com.lys.mapper;

import com.lys.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {
    List<Person> selectList();
}
