package day18;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        Teacher [] teachers= new Teacher[4];
        teachers[0]= new Teacher(28,"John",5000);
        teachers[1]= new Teacher(25,"Abraham",25000);
        teachers[2]= new Teacher(35,"Mahesh",500);
        teachers[3]= new Teacher(24,"Susan",6000);

        System.out.println("***Before Sorting****");
        for (Teacher teacher:teachers) {
            System.out.println(teacher);
        }

        System.out.println("*****After ****");
        Arrays.sort(teachers);

        for (Teacher teacher:teachers) {
            System.out.println(teacher);
        }


    }
}
