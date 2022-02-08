package day23;

public class GenericMethodPractice {


    public static void main(String[] args) {
      Integer[] values= {1,2,3,4, 5};
      printArray(values);


      String[] sValues={"age ", "name ","school"};
      printArray(sValues);

      Double[] dValues= {23.4,56.7, 67.8};
      printArray(dValues);
    }

//    public static void printArray(Integer[] values){
//        for (Integer value:values) {
//            System.out.println(value);
//        }
//
//    }
//    public static void printArray(String[] values){
//        for (String value:values) {
//            System.out.println(value);
//        }
//
//    }
//    public static void printArray(Double[] values){
//        for (Double value:values) {
//            System.out.println(value);
//        }
//
//    }

    public static <T>void printArray(T[] values){ // this will handle all
        for (T value:values) {
            System.out.println(value);
        }
        System.out.println(" ");
    }
    public static <T extends Number>void printArray(T[] values){ // this will handle only integer and double datatype
        for (T value:values) {
            System.out.print(value);
        }

    }
}
