package org.example;

public class Student {
    int StudentId;
    String StudentName;
    String StudentAdress;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAdress() {
        return StudentAdress;
    }

    public void setStudentAdress(String studentAdress) {
        StudentAdress = studentAdress;
    }

    public Student(int studentId,String StudentName,String StudentAdress) {
        this.StudentId = studentId;
        this.StudentName=StudentName;
        this.StudentAdress=StudentAdress;

    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAdress='" + StudentAdress + '\'' +
                '}';
    }
}



