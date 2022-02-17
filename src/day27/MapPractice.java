package day27;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//based on key value pair
public class MapPractice {
    public static void main(String[] args) {

        Map<String, Object> userMap= new TreeMap<>();
        userMap.put("name", "ABC");
        userMap.put("name", "DEF");//map doesnot allow duplicte key
        userMap.put("age", 24);
        userMap.put("phoneNumber", 121313);

        System.out.println(userMap);

        System.out.println(userMap.get("name"));
        System.out.println(userMap.containsKey("nam"));// return if it contains specified key or not
        System.out.println(userMap.containsValue(24));// return if it contains specified value or not

        userMap.forEach((key, value)->{
            System.out.println(value);
        });

        System.out.println(userMap.keySet());
        System.out.println(userMap.values());


    }
}
