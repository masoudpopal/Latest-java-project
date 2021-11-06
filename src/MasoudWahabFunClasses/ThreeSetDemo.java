package MasoudWahabFunClasses;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> letters = new TreeSet<>();
        letters.add("Z");
        letters.add("B");
        letters.add("A");
        letters.add("D");
        letters.add("D");
        //it will sort them based on alphabetically order and will not print duplicates
        //shortcut: if you want to change all the (letters) at once hold ALT and then select all the (letters) vertically

        System.out.println(letters);
    }
}
