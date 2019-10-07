package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    @Autowired
    private Actor act;

    public Movie() {
    }


    public void display(){
        System.out.println(act.name);
        System.out.println(act.gender);
        System.out.println(act.age);
    }

}
