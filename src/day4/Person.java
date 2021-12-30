package day4;

public class Person {

    private String name;
    private String address;
    private String phoneNO;
    private int age;
    private boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
    public static void studying(Person p){
        System.out.println(p.getAge()+" years old "+p.getName()+ " living in "+
                p.getAddress()+" whose phone number is "+p.getPhoneNO()+" is Studying and is Male: "+p.isMale());
    }
    public static void working(Person p){
        System.out.println(p.getAge()+" years old "+p.getName()+ " living in "+
                p.getAddress()+" whose phone number is "+p.getPhoneNO()+" is working and is Male: "+p.isMale());
    }
}
