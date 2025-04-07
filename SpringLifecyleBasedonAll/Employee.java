package SpringLifecyleBasedonAll;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee  implements InitializingBean, DisposableBean {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Employee() {
        super();
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empoyee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println( "destroy");
    }
}
