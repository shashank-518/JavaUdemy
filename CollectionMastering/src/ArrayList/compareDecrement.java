package ArrayList;

import java.util.Comparator;

public class compareDecrement implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}


//4,7 -> djoiif