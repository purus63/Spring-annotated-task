package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {

    @Bean(name={"MovieA","MovieB"})
    @Scope("prototype")
    public Movie movie()
    {
            return new Movie(ActorObj());
    }


    @Bean
    public Actor ActorObj(){
        return new Actor("Goma","Female",24);
    }

    @Bean
    public Actor ActorObj1(){
        return new Actor("Goma","Female",24);
    }
}
