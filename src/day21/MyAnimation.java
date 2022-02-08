package day21;

import java.io.IOException;

public class MyAnimation  {

    public String downloadImage(String url) throws IOException {
        //return "Image downloaded successfully";
        throw new IOException("This is from IOException");
    }

    public String getImageUrl() throws RuntimeException{
         //return" https://iamge.com/image1.png";
        throw new ArrayIndexOutOfBoundsException("this is from Runtime");
    }
}
