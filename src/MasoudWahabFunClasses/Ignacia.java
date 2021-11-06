package MasoudWahabFunClasses;

import java.util.Scanner;

public class Ignacia {

     String name;
     String Password;
     int age;
     String PhoneNumber;
     String SSN;


    public void SetName(String name){
        if(name.length()<20){
            this.name=name;
        }else{
            System.out.println("Your name is too long.");
        }
    }
   public void SetPassword(String Password){
        if(Password.contains("#$")){
           this.Password=Password;
        }else{
            System.out.println("You need to create a strong password.");
        }

    }


    public void setAge(int age) {
        if(age>=18){
            System.out.println(this.age = age);
        }else{
            System.out.println("You have to be eighteen and older to open an account.");
        }

    }

    public void setPhoneNumber(String phoneNumber) {
        if(PhoneNumber.length()==10){
            System.out.println(this.PhoneNumber = phoneNumber);

        }else{
            System.out.println("You entered a wrong phone number.");
        }

    }

    public void setSSN(String SSN) {
        if(SSN.length()==9){
            System.out.println(this.SSN = SSN);
        }else{

            System.out.println("Your entered social security number is not correct.");
        }

    }
}
class Testing{
    public static void main(String[] args) {

        Ignacia ignacia = new Ignacia();
        ignacia.SetName("Masoudqwasvbcnmjhfgtyu");
        ignacia.setAge(14);
        ignacia.SetPassword("Ahmad");
        ignacia.setPhoneNumber("1234654789456");
        ignacia.setSSN("987234567896796");

    }
}
