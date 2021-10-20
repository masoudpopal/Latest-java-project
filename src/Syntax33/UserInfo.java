package Syntax33;

public class UserInfo extends UserClass{
    String address;


    UserInfo(String name, String phoneNumber, String address) {
        super(name, phoneNumber);
        this.address= address;
    }
    void userDetails(){
        System.out.println(name+" "+phoneNumber+" "+address);
    }

    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo("Abdul", "9254709847", "3203 dskljds ");

       userInfo.userDetails();
    }

}
