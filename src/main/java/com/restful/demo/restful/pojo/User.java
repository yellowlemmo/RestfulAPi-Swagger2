package com.restful.demo.restful.pojo;

/**
 * @ClassName: User
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/7/30 1:06 PM
 **/
public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
