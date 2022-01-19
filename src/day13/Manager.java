package day13;

//manager class cannot further extends by other class except Executive class
public sealed class Manager extends Employee permits Executive{
    private double bonus;


    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus= bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+this.bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }

}
