package MasoudWahabFunClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTask3 {
    // create an arraylist of even numbers from 1 to 50.
    //remove any number that is divisible by 5 form that arraylist.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 2; i <=50 ; i+=2) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Iterator<Integer> iterator= arrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
