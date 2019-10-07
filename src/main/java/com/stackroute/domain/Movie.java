package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {


    private Actor act;

    @Autowired
    @Qualifier("actor")
    public void setAct(Actor act) {
        this.act = act;
    }

    public Movie() {
    }

    public Movie(Actor act){
        this.act=act;
    }

    public void display(){
        System.out.println(act.name);
        System.out.println(act.gender);
        System.out.println(act.age);
    }

}
