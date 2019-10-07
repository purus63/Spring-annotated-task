package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;
import org.springframework.context.support.GenericApplicationContext;

import java.sql.SQLOutput;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println("Application Context");
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie m1= factory.getBean("MovieA",Movie.class);
        Movie m2= factory.getBean("MovieB",Movie.class);

        m1.display();
        m2.display();



//        System.out.println("AnnotedBeanDefinitionReader");
//        GenericApplicationContext bf = new GenericApplicationContext();
//        AnnotatedBeanDefinitionReader abdr = new AnnotatedBeanDefinitionReader(bf);
//
//        abdr.register(AppConfig.class);
//        abdr.register(Movie.class);
//        bf.refresh();
//        Movie m2 =bf.getBean(Movie.class);
//        m2.display();



    }
}
