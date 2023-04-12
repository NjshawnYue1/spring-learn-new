package com.ga.controller;

import com.ga.config.JavaConfig;
import com.ga.entity.Book;
import com.ga.entity.User;
import com.ga.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        extracted();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        User bean = ctx.getBean(User.class);
        UserServiceImpl userServiceImpl = ctx.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(bean);
        System.out.println(userServiceImpl.getAllUsers());

    }

    private static void extracted() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = ctx.getBean("user1",User.class);
        User user2 = ctx.getBean("user2",User.class);
        Book book = ctx.getBean("book", Book.class);
        Book book1 = ctx.getBean("book1", Book.class);
        book1.setCode("22222");
        book1.setName("Book 1");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(book);
        System.out.println(book1);
    }
}
