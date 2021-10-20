package Syntax29;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map =new HashMap<>();
        map.put(123, "Olena");
        map.put(124,"Masoud");
        map.put(125,"Ahmad");


        Map<Integer, String>map2=new TreeMap<>();
        map2.put(1234, "Olena");


    }
}
