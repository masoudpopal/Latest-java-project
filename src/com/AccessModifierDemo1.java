package com;

public class AccessModifierDemo1 {

    private String name;
    int age;   // because it has no private, protected, and public ,so it is default.
    public double height;
    protected String city;

    public void method3() {           // public is accessible even from another package
       // System.out.println(height);
    }

    private void method1() {
        //System.out.println(name);
        //System.out.println(age);

    }

    void method2() {
        System.out.println(name);
        System.out.println(age);
        method1();
        //public static void main (String[] args){
            //System.out.println(name);   // we can not access because main is a static method

            //AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();
            //System.out.println(accessModifierDemo1.name);
            //System.out.println(accessModifierDemo1.age);
            // I can access it because I am inside the class
            //accessModifierDemo1.method1();

        }

    }


