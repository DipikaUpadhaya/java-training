package day17;

import java.util.EnumSet;
import java.util.logging.Logger;

import static day17.WeekDay.SATURDAY;

public class EnumPractice {
    public static void main(String[] args) {
        int weekDay=0;
        if(weekDay==1){
            System.out.println("weekend starts");
        }

        if (weekDay == SATURDAY.getAbbr()) {
            Logger.getGlobal().info("wEKEND STARTED");
        }

        EnumSet<WeekDay> always = EnumSet.allOf(WeekDay.class);
        EnumSet<WeekDay> never = EnumSet.noneOf(WeekDay.class);
        EnumSet<WeekDay> workday = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        EnumSet<WeekDay> mwf = EnumSet.of(WeekDay.MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY);

        System.out.println(always);
        System.out.println(never);
        System.out.println(workday);
        System.out.println(mwf);


    }
}
