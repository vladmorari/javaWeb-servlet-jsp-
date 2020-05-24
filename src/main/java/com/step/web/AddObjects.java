package com.step.web;

import java.util.ArrayList;
import java.util.List;

public class AddObjects {

    List<Objects> objList = new ArrayList<>();
//        
//        objList.add(new Objects("ion"));
//        objList.add(new Objects("vanea"));

    public void addEmp(String name) {
        objList.add(new Objects(name));
    }

    public List<Objects> getObjList() {
        objList.add(new Objects("vlad"));
        return objList;
    }

}
