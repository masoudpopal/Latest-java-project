package MasoudWahabFunClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTask {
    // create an arraylist of words. remove every word that ends with "e"
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("10");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("hike");

        //use iterator for this task
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();   //if there is element store them inside the word
            if(word.endsWith("e")|| word.endsWith("E")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
