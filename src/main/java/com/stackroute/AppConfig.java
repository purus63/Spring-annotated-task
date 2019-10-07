package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {

    @Bean(name={"MovieA"})
    public Movie movie()
    {
            return new Movie();
    }

    @Bean(name={"MovieB"})
    public Movie movie1()
    {
        return new Movie(ActorObj1());
    }

    @Bean(name="actor")
    public Actor ActorObj(){
        return new Actor("Goma","Female",24);
    }

    @Bean
    public Actor ActorObj1(){
        return new Actor("Maya","Female",24);
    }
    @Bean
    public BeanLifecycleDemoBean blcdb(){
        return new BeanLifecycleDemoBean();
    }
}
