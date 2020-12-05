package com.lys.service;

import com.lys.dao.CrudDao;
import com.lys.domain.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    private CrudDao dao;

    public List<Worker> select(){
        return dao.select();
    }

    public void add(Worker worker){
        dao.add(worker);
    }

    public Worker selectWorker(String name){
        return dao.selectWorker(name);
    }

    public void update(Worker worker){
        dao.update(worker);
    }

    public void delete(String name){
        dao.delete(name);
    }
}
