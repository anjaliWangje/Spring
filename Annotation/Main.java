package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("Annotationcfg.xml");
        Classes classes=cont.getBean("Classes", Classes.class);
        System.out.println(classes);
        System.out.println(classes.getClassAdress());
        System.out.println(classes.getClassdepartment().get(0));
        System.out.println(classes.getClassname());
    }
}