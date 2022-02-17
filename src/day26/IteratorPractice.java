package day26;

import java.util.*;
import java.util.logging.Logger;

public class IteratorPractice {

    public static void main(String[] args) {
        Collection<String> stringArrayList= new ArrayList<>();
        stringArrayList.add("ABC");
        stringArrayList.add("DEF");
        stringArrayList.add("GHI");

        //we can call iterator function in every collection classes

       Iterator<String> iterator= stringArrayList.iterator();
//       String s= iterator.next();
//        String s1= iterator.next();
//        String s2= iterator.next();
//       String s3= String.valueOf(iterator.hasNext());
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        System.out.println("Items in Arraylist are:");
        while(iterator.hasNext()){
            String item= iterator.next();
            System.out.println(item);
        }
        //can use enhanched for loop instead of iterator
        for (String item:stringArrayList) {
            System.out.println(item);
        }

       boolean contains= stringArrayList.contains("ABCD");
        System.out.println(contains);

        Collection<Student> students= new ArrayList<>();
        students.add(new Student("Ram",1));
        students.add(new Student("Hari",2));
        students.add(new Student("Shyam",3));

        boolean studentContains=students.contains(new Student("Ram",1));
        System.out.println(studentContains);

        Collection<String> stringTreeSet= new TreeSet<>();//Tree return value in either aesc/desc order
        stringTreeSet.add("A");
        stringTreeSet.add("D");
        stringTreeSet.add("B");
        stringTreeSet.add("E");
        stringTreeSet.add("C");
        stringTreeSet.add("C");
        System.out.println(stringTreeSet);//  set doesnot support duplicate value so it only return A, B, C

        Collection<Student> studentTreeSet= new TreeSet<>();// for tree set we need to implement comparable interface
        studentTreeSet.add(new Student("Ram",1));
        studentTreeSet.add(new Student("Hari",2));
        studentTreeSet.add(new Student("Shyam",3));
        studentTreeSet.add(new Student("Shyam",3));
       // Logger.getGlobal().info(studentTreeSet.toString());
        System.out.println(studentTreeSet);

        //in some cases we cannot implement comparable interface so we use Comparator.comparing(Student::getName)

        Collection<Student> stdWithoutComparableInterf= new TreeSet<Student>(Comparator.comparing(Student::getName));
        stdWithoutComparableInterf.add(new Student("Dipika", 4));
        stdWithoutComparableInterf.add(new Student("Deepa", 6));
        stdWithoutComparableInterf.add(new Student("Sabina", 5));
        stdWithoutComparableInterf.add(new Student("Sabina", 5));
        System.out.println(stdWithoutComparableInterf);






    }
}
