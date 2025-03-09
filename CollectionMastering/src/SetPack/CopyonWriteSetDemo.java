package SetPack;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyonWriteSetDemo {
    public static void main(String[] args) {
        /*

        Thread Safe
        Do not allow Duplicate element
        Separate copy is created and changes are being made
        After the complete modifications changes are being updated


         */

        CopyOnWriteArraySet<Integer> copy = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> con = new ConcurrentSkipListSet<>();


        for (int i = 0; i < 5; i++) {

            copy.add(i+1);
            con.add(i+1);

        }
        System.out.println(copy);
        System.out.println(con);

        System.out.println("Changing Values");

       for(Integer i : copy){
           System.out.println("Printing values:"+ i );

           copy.add(6); // This change will not happen automatically as copy is created
       }

        System.out.println(copy);


        for(Integer i : con){
            System.out.println("Printing values:"+ i );

            con.add(6); // This ConcurrentSkipListSet is weakly consistent as it may add or remove
        }


    }
}
