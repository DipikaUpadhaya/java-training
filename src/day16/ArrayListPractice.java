package day16;

import day15.Student;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListPractice {
    public static void main(String[] args) {

        //initial capacity is 10 bydefault
        ArrayList<String> names=new ArrayList<>(10);
        // can add multiples number to arraylist, no bound as in array i.e initial declaration required in array
        names.add("0 ram");
        names.add("1 shyam");
        names.add("2 hari");
        names.add("3 john");
        names.add("4 rohan");

        Logger.getGlobal().info(String.valueOf(names));
        // we can add names to index we prefer, here we add prashant to index 3(4) and john is moved 1 step forward
        names.add(3,"5 prashant");
        Logger.getGlobal().info(names.toString());

        names.set(3," 6 laxman");// set method just replace to specified index
        Logger.getGlobal().info(names.toString());

        ArrayList<String> namesCopy= new ArrayList<>();
        namesCopy.addAll(names); // copy to new arraylist
        Logger.getGlobal().info(namesCopy.toString());

        String indexData= names.get(3); // to fetch data of specified index
        Logger.getGlobal().info(indexData.toString());

        boolean isRemoved= names.remove("4 rohan");//here object is passed if we call boolean class
        Logger.getGlobal().info(String.valueOf(isRemoved));
        Logger.getGlobal().info(names.toString());

        String removedElement= names.remove(4);// we have to pass index of element to remove if we use String Class
        Logger.getGlobal().info(removedElement);
        Logger.getGlobal().info(names.toString());

        ArrayList<Student> students= new ArrayList<>(4);
        students.add(new Student("Abc",2,3));
        students.add(new Student("BCD",3,3));
        Logger.getGlobal().info(students.toString());

        //if equals method is discarded in Student class then .remove method willnot work here
        students.remove(new Student("Abc",2,3));
        Logger.getGlobal().info(students.toString());


    }
}
