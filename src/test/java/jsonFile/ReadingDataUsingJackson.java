package jsonFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadingDataUsingJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = "data/employee.json";
        File file = new File(filePath);

        // read json data from the file and map tp person class
        PersonPage personPage = objectMapper.readValue(file, PersonPage.class);

        // Access data
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
