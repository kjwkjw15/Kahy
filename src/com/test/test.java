package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;

public class test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//��ȡbean.xml�е�����
        User p = ctx.getBean("user",User.class);//����bean�����ö���
        p.info();
    }
}
