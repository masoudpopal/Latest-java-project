package com;

public class MasoudWahab2 {
    String name;
    String color;
    int height;
    String breed;

     MasoudWahab2 (String MasoudWahab2name, String MasoudWahab2color, int MasoudWahab2height, String MasoudWahab2Breed){

        name=MasoudWahab2name;
        color=MasoudWahab2color;
        height=MasoudWahab2height;
        breed=MasoudWahab2Breed;
    }


     MasoudWahab2() {

         color= "White";
         height= 22;
         breed = "Taazi";

    }
    void printMWInfo(){
        System.out.println("Name"+name+"color"+color);

    }

    public static void main(String[] args) {



    }
}
