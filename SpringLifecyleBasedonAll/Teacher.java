package SpringLifecyleBasedonAll;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Teacher {
    private  String subjectt;



    public Teacher() {
        super();
    }

    public String getSubjectt() {
        return subjectt;
    }

    public void setSubjectt(String subjectt) {
        this.subjectt = subjectt;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjectt='" + subjectt + '\'' +
                '}';
    }

    @PostConstruct
    public  void start(){
        System.out.println("starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
