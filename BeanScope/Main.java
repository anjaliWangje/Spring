package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("BeanScope.xml");
        System.out.println("_____prototype_____");
        Prototype p=context.getBean("prototype", Prototype.class);
        System.out.println(p);
        System.out.println(p.hashCode());
        Prototype p1=context.getBean("prototype", Prototype.class);
        System.out.println(p1);
        System.out.println(p1.hashCode());
        // Singlton
        Singleton s=context.getBean("singleton", Singleton.class);
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println("Singleton");
    }
}
