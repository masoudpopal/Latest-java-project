package MasoudWahabFunClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Sanjab");
        arrayList.add("Kalaq");
        arrayList.add("choghok");
        arrayList.add("choghok12");
        arrayList.add("choghok34");
        arrayList.add("choghok56");
        arrayList.add("choghok67");



        Iterator<String> iterator = arrayList.iterator();
       while (iterator.hasNext()){
           String animals = iterator.next();
           if(animals.length()>6){
              iterator.remove();
           }

       }
        System.out.println(arrayList);





    }

    }

