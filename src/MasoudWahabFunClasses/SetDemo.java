package MasoudWahabFunClasses;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits =new HashSet<>();
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("Apple");
        fruits.add("Apple");
        //it will not print the duplicates and order is not guaranteed

        System.out.println(fruits);
    }
}
