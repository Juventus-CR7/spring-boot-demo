package com.lys.dao;

import com.lys.domain.Worker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CrudDao {
    private static List<Worker> workerList = new ArrayList<>();
    static{
        workerList.add(new Worker("张三","经理"));
        workerList.add(new Worker("李四","前台"));
        workerList.add(new Worker("王五","销售员"));
    }

    private Worker selectOne(String name){
        for(Worker worker : workerList){
            if(worker.getName().equals(name)){
                return worker;
            }
        }
        return new Worker("","");
    }

    public List<Worker> select(){
        return workerList;
    }

    public void add(Worker worker){
        workerList.add(worker);
    }

    public Worker selectWorker(String name){
        return selectOne(name);
    }

    public void update(Worker worker){
        Worker oldRole = selectOne(worker.getName());
        oldRole.setRole(worker.getRole());
    }

    public void delete(String name){
        workerList.remove(selectOne(name));
    }
}
