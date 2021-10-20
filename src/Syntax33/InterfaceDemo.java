package Syntax33;

public interface InterfaceDemo {
    //String name; // in interface we should always put the value because by default all the interface are public/static/final
    //String name2="Masoud";  // this is how we should do it
    //protected String name3="AbdulWahab"; // we can not make them projected
     //private String car="Toyota"; // you can not make them private
    public static final String car1="BMW"; // in here we don't need to put public/static and final because by default they have those so that is why
    // it shows in another color which means they are necessary.

    // all the methods inside the interface by default they are abstract so there is no need to even mention abstract in a method in a interface
    // and also there is no need to put a body for a method inside the interface because by default they are abstract

    //void method(){ // so the moment we put the curley brackets it give errors because there is no need for a body

   // }
    // for interfaces we use the word implement to connect an interface with another interface and a class with an interface
    //it is not recommended to use multiple inheritance in java class, but we can do multiple inheritance in interface
    // in class if there is an abstract method, so then we have to make the class name abstract too otherwise it will give error.
    // The java compiler adds public and abstract keywords before the interface method and public, static and final keywords before data members
    // interview question:how we can achieve multiple inheritance in java= with the help of interfaces
    //an interface is not a class writing an interface is similar to writing a class, but they are two different concepts.
    //A class describes the attributes abd behaviours of an object.
    //An interface contains the behaviours that a class implements.
    // when to choose class or interface in inheritance? if there is forexample two things they don't have something in common use interface
    // if they have something in common use class. For Example there is a dog class and a cat class, and they can both eat ,so they are all animals
    // and they are related to each other so tha is why we call it an IS A Relationship but if there is a car and a horse and they are both rideable
    // but they are not related to each other one is an animal and the other one is a car so in that case we should use interface.


}
