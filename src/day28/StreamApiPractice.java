package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPractice {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //we can convert this normal list to stream by
        Stream<Integer> streamNumbers= numbers.stream();

        //or we can make fresh stream by
        Stream<Integer> numberStream=Stream.of(1,3,2,4,6,5);
        List<Integer> cubicNumbers= numberStream
                .sorted()
                .peek(x-> System.out.println(x))
                .filter(x->x%2==0)
                .map(x->x*x)
                //.map(x->Math.sqrt(x))
                .collect(Collectors.toList());

        System.out.println(cubicNumbers);

        List<Integer> list1= Arrays.asList(2,4,6);
        List<Integer> list2= Arrays.asList(8,10,12);
        List<Integer> list3= Arrays.asList(14,16,18);
        List<List<Integer>> listOfList= Arrays.asList(list1,list2,list3);
        System.out.println(listOfList);

        List<Integer> listOfAllIntegers = listOfList.stream()
                .flatMap(x -> x.stream())// return sublists in single lists
                .collect(Collectors.toList());
        System.out.println(listOfAllIntegers);

        List<String> countries = Arrays.asList("India", "Australia",
                "SriLanka","Russia", "Australia","SriLanka","India");
        List<String> distinctCountries = countries.stream() // return only distinct elements
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctCountries);

    }
}
