package day4;

public class EncapsulationPerson {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.setName("Dipika");
        p1.setAddress("TX");
        p1.setAge(26);
        p1.setPhoneNO("1234567");
        p1.setMale(false);
        p1.studying(p1);

        Person p2= new Person();
        p2.setName("John");
        p2.setAddress("Colorado");
        p2.setAge(27);
        p2.setPhoneNO("987654");
        p2.setMale(true);
        p2.working(p2);




    }

}
