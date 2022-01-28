package day18;

public class Teacher implements Comparable<Teacher>{
    private int age;
    private String name;
    private double salary;

    public Teacher(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
      //  return Double.compare(this.salary,o.salary);// comparision interms of salary( double value)
        //return this.name.compareTo(o.name);
       return Integer.compare(this.age,o.age);
    }
}
