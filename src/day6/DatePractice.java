package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class DatePractice {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println( "Current date is : "+date);

        LocalDate localDate= LocalDate.now();
        Logger.getGlobal().info(String.valueOf(localDate));
        System.out.println("Current loacl date is : "+localDate);

        LocalTime time= LocalTime.now();
        Logger.getGlobal().info(String.valueOf(time));

        //Current
        LocalDateTime localDateTime = LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf(localDateTime));

        //Formatting
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String formattedDate = dateFormatter.format(localDateTime);
        Logger.getGlobal().info(formattedDate);

        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));

    }
}
