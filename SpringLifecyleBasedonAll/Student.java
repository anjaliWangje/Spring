package SpringLifecyleBasedonAll;

public class Student {
    private  double fees;

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        System.out.println("setting fees");
        this.fees = fees;
    }

    public Student() {
        super();
    }

    public Student(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fees=" + fees +
                '}';
    }
    public void  init(){
        System.out.println("inside init method");
    }
    public void destroy(){
        System.out.println("inside destroy method");
    }
}
