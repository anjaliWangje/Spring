package AnnotationbasedAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext contect= new ClassPathXmlApplicationContext("Annotaion.xml");
        Company cc=contect.getBean(Company.class);
        System.out.println(cc);
    }
}
