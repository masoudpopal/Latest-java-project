package MasoudWahabFunClasses;

import org.apache.poi.ss.formula.eval.UnaryMinusEval;

import java.util.*;

public class Tamrin1 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Rabbit");
        animals.add("Squaril");
        animals.add("Frog");
        animals.add("Frog");


        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            String anim = iterator.next();
            if (anim.contains("i")) {
                iterator.remove();

            }

        }
        System.out.println(animals);

    }
}
