package jsonFile;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingDataFromJsonUsingGsonLibrary {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("data/employee.json");

        // map with json object
        Gson gson = new Gson();
        PersonPage personPage = gson.fromJson(fileReader, PersonPage.class);

        // access data
        System.out.println("page:" + personPage.getPage());
        System.out.println("per_page:" + personPage.getPer_page());
        System.out.println("total:" + personPage.getTotal());
        System.out.println("total_pages:" + personPage.getTotal_pages());

        for (PersonData data : personPage.getData()) {
            System.out.println("id:" + data.getId());
            System.out.println("email:" + data.getEmail());
            System.out.println("first_name:" + data.getFirst_name());
            System.out.println("last_name:" + data.getLast_name());
            System.out.println("avatar:" + data.getAvatar());
        }
        System.out.println("url:" + personPage.getSupport().getUrl());
        System.out.println("text:" + personPage.getSupport().getText());

    }


}
