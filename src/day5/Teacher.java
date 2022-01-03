package day5;

public class Teacher extends Person {
    //private String name;
    //private String address;
    //private int age;
    private String subject;
    private float salary;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
