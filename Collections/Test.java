package Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(" configg.xml");
        Employee Emp1=(Employee)context.getBean("Emp1");
        System.out.println(Emp1.getName());
        System.out.println(Emp1.getPhones());
        System.out.println(Emp1.getAdress());
        System.out.println(Emp1.getCourse());


    }
}
