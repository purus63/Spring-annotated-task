package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;
import org.springframework.context.support.GenericApplicationContext;

public class Main
{
    public static void main( String[] args )
    {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie m1= factory.getBean(Movie.class);
        m1.display();

        GenericApplicationContext bf = new GenericApplicationContext();
        AnnotatedBeanDefinitionReader abdr = new AnnotatedBeanDefinitionReader(bf);

        abdr.register(AppConfig.class);
        abdr.register(Movie.class);
        bf.refresh();
        Movie m2 =bf.getBean(Movie.class);
        m2.display();



    }
}
