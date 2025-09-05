package src.collection.map;

import java.time.DayOfWeek;
import java.util.EnumMap;

public class EnumDemo {
    public static void main(String[] args) {
        EnumMap<DayOfWeek, String> activityMap = new EnumMap<>(DayOfWeek.class);
        activityMap.put(DayOfWeek.SATURDAY, "Karate");
        activityMap.put(DayOfWeek.MONDAY, "Soccer");
        activityMap.put(DayOfWeek.TUESDAY, "BasketBAll");
        activityMap.put(DayOfWeek.WEDNESDAY, "Hiking");
        System.out.println(activityMap.containsKey(DayOfWeek.THURSDAY));
        System.out.println(activityMap.size());
        System.out.println(activityMap.remove(DayOfWeek.WEDNESDAY));
        System.out.println(activityMap.values());
        System.out.println(activityMap.entrySet());
        System.out.println(activityMap);

    }
}
