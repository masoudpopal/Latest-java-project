package Syntax29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GettingAllTheElements {


    public static void main(String[] args) {
        ArrayList<String>grocery=new ArrayList<String>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Eggs");
        grocery.add("jam");

        System.out.println("*************The First Way to get the elements*******");

        for(String gros: grocery){
            System.out.println(gros);


        }

        System.out.println("************The second way to get the elements***********");

        for(int i=0; i< grocery.size();i++){
            System.out.println(grocery.get(i));
        }


        System.out.println("*************The third way to get the elements");

        Iterator<String>iterator=grocery.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<String> car=new TreeSet<>();
        car.add("BMW");
        car.add("Kia");
        car.add("Toyota");






    }
}
