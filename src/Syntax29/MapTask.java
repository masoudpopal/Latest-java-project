package Syntax29;

import java.util.TreeMap;

public class MapTask {
    public static void main(String[] args) {
        TreeMap<Integer,String>building = new TreeMap<>();
        building.put(1, "Facebook");
        building.put(2, "Google");
        building.put(3, "Netflex");
        building.put(4, "Amazon");
        building.put(5, "Google");
        building.put(6, "Apple");
        building.put(7, "IBM");
        building.put(1, "Apple");
        System.out.println(building);
        System.out.println(building.size());
        building.replace(4,"Adobe");
        building.remove(7);
        System.out.println(building);


    }
}
