package MasoudWahabFunClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cityName= new ArrayList<>();

        cityName.add("Herat");
        cityName.add("Ghour");
        cityName.add("Badghis");

        //we can get the element in three different ways
        // when only accessing the elements always use enhanced for loop that means if you are changing anything.
        for (String city:cityName
             ) {
            System.out.println(city);

        }
        System.out.println("=======================================");
        for (int i = 0; i < cityName.size(); i++) {
            System.out.println(cityName.get(i));

        }
        System.out.println("==============");
        Iterator<String> iterator=cityName.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
