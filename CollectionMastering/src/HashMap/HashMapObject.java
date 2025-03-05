package HashMap;

import java.util.HashMap;

public class HashMapObject {

    public static void main(String[] args) {
        HashMap<Person , String> map = new HashMap<>();
        Person p1 = new Person("Shashank" , 1);
        Person p2 = new Person("Shreyas" , 2);
        Person p3 = new Person("Shashank" , 1);

        map.put(p1, "Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");

        System.out.println("Map Size:"+ map.size());
        System.out.println("P1 is : "+ map.get(p1));
        System.out.println("P3 is : "+ map.get(p3));

    }
}

class Person {
    private String name;

    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
