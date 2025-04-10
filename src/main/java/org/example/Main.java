package org.example;

import org.example.config.ConfigClass;
import org.example.peekingiterator.Handler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        Handler handler = context.getBean(Handler.class);

        handler.handleInputAndOutput();
    }
}