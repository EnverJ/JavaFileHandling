package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","Enver");
        properties.setProperty("email","email@gmail.com");
        properties.setProperty("age","30");

        String filePath=System.getProperty("user.dir")+"/data/config.properties";
        FileOutputStream file = new FileOutputStream(filePath);
        properties.store(file, "Sample data is properties file...");
        file.close();
        System.out.println("Properties have been written into "+filePath);


    }
}
