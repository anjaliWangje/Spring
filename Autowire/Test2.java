package Springcore.Autowire;

import Springconstructor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(" Autowire.cfg.xml");
     //   Person p = (Person) context.getBean("Person");
        Emp emp1=context.getBean("emp1", Emp.class);
        System.out.println(emp1);




      //  System.out.println(p);
    }
}
