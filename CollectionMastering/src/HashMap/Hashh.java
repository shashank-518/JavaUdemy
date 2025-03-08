package HashMap;

import java.util.Hashtable;

public class Hashh {

    public static void main(String[] args) {
        Hashtable<Integer,String> mapp = new Hashtable<>();

        mapp.put(1,"Shashank");
        mapp.put(2,"Sahana");
        mapp.put(3,"Mizba");

        System.out.println(mapp);

        /*

            This is class that implements map in background

            The only difference is it is synchronized

            means if we use thread after one process take place at time and go to another process

            other map is not synchronized


         */

    }

}
