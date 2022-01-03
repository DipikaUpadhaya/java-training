package day5;

public class Student extends Person{
    //private String name;
   // private int age;
    //private String address;
    private String studentClass;
    private float fee;


    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

}
