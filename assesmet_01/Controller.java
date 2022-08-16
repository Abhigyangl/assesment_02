package com.java.mypackage;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.boot.Metadata;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Controller {

public static void main(String[] args) {

  //Create typesafe ServiceRegistry object

  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

  SessionFactory factory = meta.getSessionFactoryBuilder().build();

  Session session = factory.openSession();

  Transaction t = session.beginTransaction();
  
  //To store data into database
  
   Employee e = new Employee();
   
   e.setEno(101);
   e.setName("Abhigyan");
   e.setSal(50000.0f);
   session.save(e);

   Query q= em.createQuery("from Employee");

   List <Employee> list= q.getResultList();

   for(Employee se:list)

   {

    System.out.println(se.getEmpno()+" "+se.getName()+" "+se.getDesignation()+" "+se.getSal());
  }
   

  t.commit();
  factory.close();
  session.close();

}

}