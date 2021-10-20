package Syntax29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {


        //Create an arraylist of cars and retrieve all the values using 3 different ways.
        //Create an arrayList of words. Remove every word that ends with “e”.
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        //Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW M3");
        cars.add("HONDA");
        cars.add("TOYOTA CHR");
        cars.add("Hyundai tucson");
        cars.add("Lucid");
        System.out.println("=====================");
        // when only accessing the elements always use enhanced for loop
        for(String car:cars
        ){
            System.out.println(car);
        }
        System.out.println("=====================");
        for(int i= 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("=====================");
        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
