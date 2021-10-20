package Syntax29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(101,"Oxana");
        map.put(102,"Abdul");
        map.put(103,"Jane");
        map.put(303,"Mike");
        map.put(null,null);
        map.put(90,"Abdul");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

        Map<Integer,String> lmap=new LinkedHashMap<>();
        lmap.put(101,"Oxana");
        lmap.put(102,"Abdul");
        lmap.put(103,"Jane");
        lmap.put(303,"Mike");
        lmap.put(null,null);
        lmap.put(90,"Abdul");
        System.out.println("Linked HashMap");
        System.out.println(lmap);




    }
}
