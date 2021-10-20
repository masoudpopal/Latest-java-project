package Syntax33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class MasoudWahab {
    public static void main(String[] args) {
        TreeSet map=new TreeSet();
        map.add("One");
        map.add("Two");
        map.add("three");
        map.add("Four");
        map.add("One");

        Iterator it= map.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }



    }
}
