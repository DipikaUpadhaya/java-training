package day12;

import java.util.logging.Logger;

public class CommandLineArguement {
    public static void main(String[] args) {
        String url="https://dev.google.com";
        String name;//= args[1];
      //  Logger.getGlobal().info(name);
        Logger.getGlobal().info(url);
        if(args.length!=0){
            switch(args[0]){
                case "dip" ->name="dipika";
                case "ram"->name="ramesh";
                default -> name="ridam";
            }
        }else{
            name="ridika";
        }
        Logger.getGlobal().info(name);
    }
}
