package day24;

import java.util.logging.Logger;

public class RecordPracMain {
    public static void main(String[] args) {
        RecordPractice recordPractice= new RecordPractice("John", 25, 5000);
        RecordPractice recordPractice1= new RecordPractice("John", 25, 5000);

        WithoutRecordPrac withoutRecordPrac= new WithoutRecordPrac("Ram", 25, 6000);
        WithoutRecordPrac withoutRecordPrac1= new WithoutRecordPrac("Ram", 25, 6000);

        Logger.getGlobal().info(String.valueOf(recordPractice));
        Logger.getGlobal().info(String.valueOf(recordPractice1));

        Logger.getGlobal().info(String.valueOf(withoutRecordPrac));
        Logger.getGlobal().info(String.valueOf(withoutRecordPrac1));

        boolean isEqual= recordPractice.equals(recordPractice1);
        Logger.getGlobal().info(String.valueOf(isEqual));

        boolean isEqual1=withoutRecordPrac.equals(withoutRecordPrac1);
        Logger.getGlobal().info(String.valueOf(isEqual1));

    }
}
