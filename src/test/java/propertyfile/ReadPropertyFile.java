package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // user.dir is the curren location of the project
        String filePath = System.getProperty("user.dir")+"/data/config.properties";
        // reading
        FileInputStream fileInputStream = new FileInputStream(filePath);
        // load the file
        properties.load(fileInputStream);
        fileInputStream.close();

        // read data value
        String age = properties.getProperty("age");
        String name = properties.getProperty("name");
        String email = properties.getProperty("email");
        System.out.println("age: "+age+", "+"name: "+name+", "+"email: "+email);
        // age: 30, name: Enver, email: email@gmail.com

        // capture all the keys  -- method 1
        Set<String> keys=properties.stringPropertyNames();
        System.out.println(keys); // [name, age, email]

        // capture all the keys  --method 2
        Set<Object> allKeys=properties.keySet();
        System.out.println(allKeys);  // [name, age, email]

        // capture all the values
        Collection<Object> values=properties.values();
        System.out.println(values);  // [Enver, 30, email@gmail.com]

        // read all the properties and theirs values
        for(String key:properties.stringPropertyNames()){
            System.out.println(key+": "+properties.getProperty(key));
            // name: Enver
            //age: 30
            //email: email@gmail.com

        }


    }
}
