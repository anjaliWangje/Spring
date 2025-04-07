package SpringLifecyleBasedonAll;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {


        AbstractApplicationContext Context = new ClassPathXmlApplicationContext("lifecyle.config.xml");
        Context.registerShutdownHook();

        Student student1 = (Student) Context.getBean("Student1");
        System.out.println(student1);
        //Context.registerShutdownHook();
        System.out.println("++++++++++++++++++++++++++++");
        Employee employee1=(Employee) Context.getBean("Employee1");
        System.out.println(employee1);
        Teacher teacher=(Teacher) Context.getBean("teacher");
        System.out.println(teacher);



    }
}