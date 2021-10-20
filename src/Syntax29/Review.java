package Syntax29;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Review {

    String Name;
    String Color;
    int age;
    Review(String rName, int rage, String rColor){
        Name=rName;
        age= rage;
        Color=rColor;

    }
    Review(int rage, String rName, String rColor){
        age=rage;
        Name=rName;
        Color=rColor;
    }


    void Print(){
        System.out.println("Name"+"  "+Name+"   "+"age "+age);
    }

    public static void main(String[] args) {
     Review review = new Review("Wahab", 33, "Black");

    }

}
