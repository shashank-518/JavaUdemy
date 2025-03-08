package HashMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {
        Map <Day,String> map = new EnumMap<>(Day.class);

        map.put(Day.Saturday , "Gym");
        map.put(Day.Monday, "Badminton");
        System.out.println(Day.Monday.ordinal());
        System.out.println(map);


        //Faster Access
        //No Hash
        //Array size same as enum size

    }

}

enum Day{
    Monday , Tuesday , Wednesday, Thrusday , Friday , Saturday , Sunday
}
