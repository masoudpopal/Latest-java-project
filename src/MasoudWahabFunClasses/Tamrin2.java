package MasoudWahabFunClasses;

public class Tamrin2 {
   //Declare two static variables to hold
   //country name
   //continent
   //Create a method to display the value of static variables in the following format:
   //____ located on ____ continent
   //In the main method assign values to a static variable and execute method display
   //Expected Output:
   //Morocco located on Africa continent

    public static String countryName;
    public static String continent;
      void   location(String country, String Location){
          countryName=country;
          continent=Location;

        System.out.println(countryName+"is located on "+ continent);
    }


        public static void main(String[] args) {

            Tamrin2 tamrin2=new Tamrin2();
            tamrin2.location("Afghanistan", "Asia");


    }

    }

