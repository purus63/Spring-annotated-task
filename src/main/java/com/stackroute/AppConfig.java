package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Movie movie()
    {
            return new Movie();
    }

    @Bean
    public Actor ActorObj(){
            return new Actor("ram","male",42);
    }


}
