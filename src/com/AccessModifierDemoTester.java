package com;

public class AccessModifierDemoTester {
    public static void main(String[] args) {
AccessModifierDemo1 accessModifierDemo1=new AccessModifierDemo1();
        //System.out.println(accessModifierDemo1.name);
        // can not access because field is private
        System.out.println(accessModifierDemo1.age);
        // can access it because it is not private, and it has default access which means we can access it inside same
        // package

    }
}
