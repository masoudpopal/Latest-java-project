package Syntax32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HomeWork {
    public static void main(String[] args) throws IOException {
       //String path = System.getProperty("user.dir")+"Files\\Config2.properties";
       //By using System.getProperty("user.dir") we dynamically get the path and it will work in any computer after concatination.

        String path = System.getProperty("user.dir")+"\\Files\\Config2.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        //fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties1=new Properties();
        properties.store(fileOutputStream,"Masoud");




    }
}
