package csvfile;

import java.io.*;
import java.util.Scanner;

public class csvFileReading {
    public static void main(String[] args) throws IOException {
        String fileLocation = System.getProperty("user.dir") + "/data/example.csv";
        // 1. approach --- using scanner class

      /*  File file = new File(fileLocation);

        Scanner sc = new Scanner(file);
        sc.useDelimiter(","); // , used to separate value in csv file
        while (sc.hasNext()){
            System.out.println(sc.next()+"\t");  // \t tab space
            System.out.print(sc.next()+"\t");

        }
        sc.close();          */

        // approach 2: file reader
        FileReader reader = new FileReader(fileLocation);

        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            for (String value : data) {
                System.out.println(value+"\t");
            }
            System.out.println();

        }
    }
}
