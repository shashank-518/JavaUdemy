package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LruCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LruCache<String,Integer> map = new LruCache<>(3);

        map.put("Bob",7);
        map.put("Alice",5);
        map.put("Shashank",8);
        map.get("Bob");
        map.put("Shreyas",6);

        System.out.println(map);

    }
}
