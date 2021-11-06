package MasoudWahabFunClasses;

import java.util.ArrayList;

public class IteratorTask2 {
    //create an arraylist of drinks. if any drink has letter "a" or "e" replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Fanta ");
        drinks.add("Orange");
        drinks.add("Coke");
        drinks.add("Rum");
        drinks.add("Cherry");
        System.out.println(drinks);

        for (int i  = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e") || drinks.get(i).contains("a")){
                drinks.set(i,"water");
            }

        }
        System.out.println(drinks);


    }
}
