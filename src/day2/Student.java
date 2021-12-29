package day2;

public class Student {
    String name;
    String phoneNumber;
    String dob;
    String sClass;
    String rollNumber;
    float height;
    String address;
    String idNumber;
    String email;
    String username;
    String password;
    String emergencyContactNumber;
    String socialSecurityNumber;

    public void present(Student stdnt){
        System.out.println(stdnt.name+ " is present");
    }
    public void studying(Student stdnt){
        System.out.println(stdnt.name+" is studying");
    }
    public void playing(Student stdnt){
        System.out.println(stdnt.name+" is playing");
    }
    public void working(Student stdnt){
        System.out.println(stdnt.name+" is working");
    }
    public void teaching(Student stdnt){
        System.out.println(stdnt.name+" is teaching");
    }
    public void discussing(Student stdnt){
        System.out.println(stdnt.name+" is discussing");
    }
    public void eating(Student stdnt){
        System.out.println(stdnt.name+" is eating");
    }
    public static void main(String[] args){
        Student std1=new Student();
        std1.address="samakhusi";
        std1.dob="1995/08/18";
        std1.email="xyz@gmail.com";
        std1.height= 5.6F;
        std1.name="Ram";
        std1.rollNumber="CSIT 054";
        std1.socialSecurityNumber="12356789";
        std1.username="ram1";
        std1.discussing(std1);
        std1.playing(std1);
        std1.studying(std1);
        std1.eating(std1);
        std1.teaching(std1);
        std1.present(std1);
        std1.working(std1);
        printStudent(std1);

        Student std2=new Student();
        std2.address="kirtipur";
        std2.dob="1996/08/18";
        std2.email="pqr@gmail.com";
        std2.height= 6.1F;
        std2.name="Shyam";
        std2.rollNumber="CSIT 062";
        std2.socialSecurityNumber="987654321";
        std2.username="shyam1";
        std2.discussing(std2);
        std2.playing(std2);
        std2.studying(std2);
        std2.eating(std2);
        std2.teaching(std2);
        std2.present(std2);
        std2.working(std2);
        printStudent(std2);
    }
    public static void printStudent(Student std){
        System.out.println(" ");
        System.out.println("Name = "+std.name);
        System.out.println("Address = "+std.address);
        System.out.println("DOB = "+std.dob);
        System.out.println("Email = "+std.email);
        System.out.println("RollNumber = "+std.rollNumber);
        System.out.println("Username = "+std.username);
        System.out.println("SocialSecurityNumber = "+std.socialSecurityNumber);
        System.out.println("Height = "+std.height);
        System.out.println(" ");

    }
}
