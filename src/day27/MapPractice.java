package day27;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class MapPractice {

//    {
//        "name" : "Taman",
//         "age" : 28,
//         "phone" : "12123123123",
//         "isLoggedIn" : true
//    }

    public static void main(String[] args) {
        Map<String, Object> userMap = new LinkedHashMap<>();

        userMap.put("name", "Taman");
        userMap.put("age", 28);
        userMap.put("phone", "121212121345");
        userMap.put("isLoggedIn", true);

        System.out.println(userMap);
//
//        System.out.println(userMap.get("name"));
//
//        System.out.println(userMap.containsKey("nameeee"));

//        userMap.forEach((key, value) -> {
//            System.out.println(value);
//        });

//        System.out.println(userMap.keySet());

//        System.out.println(userMap.values());

    }
}
