package csvfile;

import java.io.FileWriter;
import java.io.IOException;

public class csvFileWriter {
    public static void main(String[] args) throws IOException {
        String csvFileName = System.getProperty("user.dir") + "/data/example.csv";
        FileWriter csvFile = new FileWriter(csvFileName);
        csvFile.append("name, age, Email\n"); // header
        csvFile.append("John, 31,johnmail@gmail.com\n");
        csvFile.append("Josh, 33,johnmail2@gmail.com\n");
        csvFile.append("Kelli, 52,johnmail3@gmail.com\n");
        csvFile.append("Helli, 42,johnmail@gmail.com\n");
        csvFile.append("Tom, 42,tom@gmail.com\n");
        csvFile.append("Johny, 32,johny@gmail.com\n");
        csvFile.close();
        System.out.println("CSV file created at "+ csvFileName);
    }
}
