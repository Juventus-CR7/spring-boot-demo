package com.lys.dao2;

import com.lys.domain.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao2 {
    @Select("select * from person")
    List<Person> selectAll();
}
