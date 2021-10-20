package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWritingDataDemo {
    public static void main(String[] args) throws IOException {
        //Path where i want to create the file on my computer
        String path="C:\\Users\\masou\\IdeaProjects\\SDETjavaBATCH10\\Files\\Config1.properties";
        //Navigating to the path and creating a new file
        FileOutputStream fileOutputStream=new FileOutputStream(path); // to write the data use fileoutputstream
        //Opening the specific program and putting the data
        Properties properties=new Properties();
        properties.put("URL","www.google.com");
        //saving changes to the file
        properties.store(fileOutputStream,"new data added");
        // Now by running this program a new file by the name of (Config1.properties) got created in the files
    }
}
