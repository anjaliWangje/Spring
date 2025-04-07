package Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private  String name;
    private List<String>phones;
    private Set<String>Adress;
    private Map<String,String>Course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAdress() {
        return Adress;
    }

    public void setAdress(Set<String> adress) {
        Adress = adress;
    }

    public Map<String, String> getCourse() {
        return Course;
    }

    public void setCourse(Map<String, String> course) {
        Course = course;
    }

    public Employee(String name, List<String> phones, Set<String> adress, Map<String, String> course) {
        this.name = name;
        this.phones = phones;
        Adress = adress;
        Course = course;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", Adress=" + Adress +
                ", Course=" + Course +
                '}';
    }
}
