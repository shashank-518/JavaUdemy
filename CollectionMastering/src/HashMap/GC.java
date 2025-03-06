package HashMap;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class GC {

    public static void main(String[] args) {

        Phone newPhone = new Phone("Apple", "16 pro max");
        newPhone = null; // Setting this value to null directly
        WeakReference<Phone> newPhone2 = new WeakReference<>(new Phone("Nokia" , "ns200"));
        System.out.println(newPhone2.get());
        System.out.println(newPhone);

    }
}

class Phone{
    private String Name;

    private String model;

    public Phone(String name, String model) {
        Name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Name='" + Name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
