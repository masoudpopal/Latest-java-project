package com.Review;

public class MethodDemo {

    public static void main(String[] args) {
        String employeeFirstName = "michael";
        String employeeLastName = "Lopez";
        String position = "permanent";

        if(position.equalsIgnoreCase("permanent")){
            String firstHalfOfFirstName= employeeFirstName.substring(0,employeeFirstName.length()/2);
            String secondHalfOfLastName= employeeFirstName.substring(employeeLastName.length()/2);


        }
    }

}
