package MasoudWahabFunClasses;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("Apple");
        fruits.add("Apple");
        //it will not print the duplicates and print the order they way were inserted

        System.out.println(fruits);
    }
}
