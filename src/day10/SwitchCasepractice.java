package day10;

public class SwitchCasepractice {
    public static void main(String[] args) {
        int a=5;
        switch (a) {
            case 1 -> System.out.println("Today is Sunday");
            case 2 -> System.out.println("Today is Monday");
            case 3 -> System.out.println("Today is Tuesday");
            case 4 -> System.out.println("Today is Wednesday");
            case 5 -> System.out.println("Today is Thursday");
            case 6 -> System.out.println("Today is Friday");
            default -> System.out.println("Today is Saturday");
        }


    }
}
