package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.User;
 
public class test2 {
 
    public static void main(String[] args){
        User s = new User();
        s.setName("s2");
        s.setPassword("123");
         
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
         
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close();
        sf.close();    
    }
}