package com.hengxinyongli.model;

import java.io.Serializable;


public class User implements Serializable{


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id ;

    private String name;

}
