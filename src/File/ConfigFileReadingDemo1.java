package File;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadingDemo1 {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path="C:\\Users\\masou\\IdeaProjects\\SDETjavaBATCH10\\Files\\Config.properties"; //Locate the file
        //Creating a connection between class or navigation to that file
        FileInputStream fileInputStream=new FileInputStream(path);  // navigate to the file
        //choosing a program to open thatfile
        Properties properties=new Properties(); //Selecting the proper class or program
        //opening the file
        properties.load(fileInputStream); //Opening the file
        //Reading the data
        System.out.println(properties.get("UserName")); // get the data
        System.out.println(properties.get("Password"));

    }
}
