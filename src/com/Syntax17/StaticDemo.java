package com.Syntax17;

public class StaticDemo {
    String name="BlaBla";
    static String country="USA";
    void method1(){
        System.out.println(name);
        System.out.println(country);
    }
    static void method2(){
        //System.out.println(name);  // i will get an error because name is an instance field and its value
        // can vary rom object to object
        StaticDemo staticDemo =new StaticDemo();
        System.out.println(staticDemo.name);
        staticDemo.method1();
        method3();
    }
    static void method3(){
        System.out.println("static method 3");
    }
}
