package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("my program started");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("JDBCTemplate", JdbcTemplate.class);

//        String query = "Create table Student(StudentId INT ,name VARCHAR(100),  city VARCHAR(100))";
//        template.execute(query);
        System.out.println("Created");
        String query1 = "insert into Student(StudentId,name,city) values(?,?,?)";
        int StudentId = 1;
        String name = "Anjali Wangje";
        String city = "latur";
        template.update(query1, StudentId, name, city);
        System.out.println("Yes");

//
    }
}
//JdbcTemplate
//DriverManagerDataSource;