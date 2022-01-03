package day5;

public class School {
    public static void main(String[] args) {
        Person s1= new Student();
        s1.setName("ABC");
        s1.setAddress("TX");
        ((Student) s1).setStudentClass("8");
        s1.setAge(12);
        ((Student) s1).setFee(2000);
        s1.studying((Student) s1);


        Teacher t1= new Teacher();
        t1.setName("XYZ");
        t1.setAddress("NY");
        t1.setSubject("Science");
        t1.setAge(35);
        t1.setSalary(30000);
        t1.teaching(t1);

    }
}
