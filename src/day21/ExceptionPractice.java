package day21;

import java.io.IOException;
import java.util.logging.Logger;

public class ExceptionPractice {
    public static void main(String[] args) {
        MyAnimation myAnimation = new MyAnimation();

//        try {
//            myAnimation.downloadImage("https://image.com");
//        } catch (IOException e) {
//            e.printStackTrace();
//            Logger.getGlobal().info(e.getMessage());
//        }

        try {
            myAnimation.downloadImage("https://image.com");
            myAnimation.getImageUrl();
        }catch (IOException | RuntimeException e) {
            e.printStackTrace();
            Logger.getGlobal().info(e.getMessage());
        }
    }
}
