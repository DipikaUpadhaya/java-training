package day12;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] integer={8,4,6,3,1};

        System.out.println("Before sorting");
        for(int i:integer){
            System.out.print(i+" ");
        }

        Arrays.sort(integer);

        System.out.println(" ");
        System.out.println("After Sorting");
        for (int j:integer){
            System.out.print(j+" ");
        }

    }
}
