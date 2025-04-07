package Spring.ref;

import Collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext(" refcfg.xml");
    AA temp=(AA)context.getBean("AAref");
    System.out.println(temp.getXx());
    System.out.println(temp.getObj().getYy());
    System.out.println( temp);


}
}
