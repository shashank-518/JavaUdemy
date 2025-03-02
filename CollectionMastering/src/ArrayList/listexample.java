package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class listexample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(90);

        System.out.println(list.get(2));
        System.out.println(list.size());

        for(int i =0 ; i< list.size(); i++){
            System.out.println(i);
        }

    }
}
