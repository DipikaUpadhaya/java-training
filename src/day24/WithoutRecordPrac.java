package day24;

import java.util.Objects;

public class WithoutRecordPrac {
    private String name;
    private int age;
    private double fee;

    public WithoutRecordPrac(String name, int age, double fee) {
        this.name = name;
        this.age = age;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "WithoutRecordPrac{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fee=" + fee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WithoutRecordPrac that = (WithoutRecordPrac) o;
        return age == that.age && Double.compare(that.fee, fee) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, fee);
    }
}
