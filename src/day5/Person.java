package day5;

public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   public static void studying(Student student){
       System.out.println(student.getName()+" having age "+student.getAge()+" living in "+student.getAddress()
        +" of class "+student.getStudentClass()+" pay "+ student.getFee()+" fee. ");
    }
    public static void teaching(Teacher teacher){
        System.out.println(teacher.getName()+" having age "+teacher.getAge()+" living in "+teacher.getAddress()
                +" teaches subject "+teacher.getSubject()+" get "+ teacher.getSalary()+" salary. ");
    }
}
