package Syntax33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo5 {
    public static void main(String[] args) throws FileNotFoundException {
        //For every problem we need a different (try/catch)
        System.out.print("1 ");
        try{
            System.out.print("2 ");

            //System.out.print(10/0); // if we comment this line then the results will be different
            System.out.print("3 ");
            String name=null;
            FileInputStream fileInputStream=new FileInputStream("Masoud");
            System.out.print("4 ");
            name.length();
            System.out.print("5 ");
            int arr[]=new int[-10];
            System.out.print("6 ");
        }catch (ArithmeticException e){  //This catch block will take care of the problem and print number 7 will print and will
                                         //ignore print number 8 and 9 and then i will print number 10.
            System.out.print("7 ");
            //System.out.println("Not possible in math");
        }catch (NegativeArraySizeException e){
            System.out.print("8 ");
        }catch (NullPointerException e){
           // System.out.println("Please don't put null");
            System.out.print("9 ");
        }catch (Exception e){
            System.out.println("something went wrong");
        }finally { // if you put anything inside the try block finally will be printed no matter what
            System.out.println("10");
        }
        System.out.print("11 ");
        //print 1 and 2 will print but print 3/4/5/6 won't print because they are under the (10/0) which is wrong
    }
}
