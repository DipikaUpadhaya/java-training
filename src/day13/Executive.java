package day13;

public final class Executive extends Manager {
    private double profit;


    public Executive(String name, int age, double salary, double bonus, double profit) {
        super(name, age, salary, bonus);
        this.profit = profit;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.profit;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus() +
                ", profit=" + profit +
                '}';
    }
}
