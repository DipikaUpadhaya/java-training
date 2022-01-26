package day15;

//it is same as to public class Student extends Object.
//every class extends Object class which is hidden

import java.util.Objects;

public class Student {
    private String name;
    private int rollNo;
    private int studentClass;


    public Student(String name, int rollNo, int studentClass) {
        this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", studentClass=" + studentClass +
                '}';
    }
// if we want to print only name, it can also work as getter
//    @Override
//    public String toString() {
//        return this.name;
//    }

// if we want to print only rollno;
    //String.value of is needed to convert int to String type
//    @Override
//    public String toString() {
//        return String.valueOf(this.rollNo);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && studentClass == student.studentClass && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, studentClass);
    }
}
