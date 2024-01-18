package testfiles;

import java.io.*;
import java.util.Scanner;

public class FileActions {
    //
    public static void createFile(String filePath) {
        File myObj = new File(filePath);
        try {
            if (myObj.createNewFile()) {
                System.out.println("file created " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // write data into file
    public static void writeFile(String filePath) {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write("Welcome to java file handling");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("an Error occurred...");
            throw new RuntimeException(e);
        }
    }

    // read the data from the file
    public static void readData(String filePath) {
        File myObj = new File(filePath);
        Scanner sc = null;
        try {
            sc = new Scanner(myObj);
            while (sc.hasNext()) {
                String data = sc.nextLine();
                System.out.println("read data: " + data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    // rename the file
    public static void renameFile(String oldFilePath, String newFilePath){
        File oldFile= new File(oldFilePath);
        File newFile= new File(newFilePath);
        if(oldFile.renameTo(newFile)){
            System.out.println("File is renamed to "+ newFilePath);
        }else {
            System.out.println("Renaming failed");
        }

    }

    // delete a file
    public static void deleteFie(String filePath){
        File myObj= new File(filePath);
        if(myObj.delete()){
            System.out.println(myObj.getName()+" File deleted");
        } else {
            System.out.println("Failed to Delete the file'");
        }

    }


    public static void main(String[] args) {
        String filePath = "src/test/java/testfiles/myfile";
        String newPth= "src/test/java/testfiles/myFile";
        createFile(filePath);
        writeFile(filePath);
        readData(filePath);
        renameFile(filePath,newPth);
        deleteFie(filePath);

    }
}
