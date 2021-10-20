package Syntax33;

public class ExceptionDemo {
    public static void main(String[] args) {
        // here because of (10/0) line problem it will not print all the lines which have errors so we
        //have to find a way to find a solution or exception
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        // here the Arithmetic is the name of the problem so,we put ArithmeticException to take care of the problem
        try{
            System.out.println(10/0);// here we can not divide 10 by 0 so that is why it gives error.
        }catch (ArithmeticException e){   //This letter (e) is just a variable we can put anything
            System.out.println("This is not possible in java");
        }

        System.out.println("Line 1 after error");
        System.out.println("Line 2 after error ");
        System.out.println("Line 3 after error");
        System.out.println("Line 4 after error");
        System.out.println("Line 5 after error");


    }
}
