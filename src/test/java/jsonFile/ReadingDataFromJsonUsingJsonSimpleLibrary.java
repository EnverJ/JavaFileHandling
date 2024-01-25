package jsonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromJsonUsingJsonSimpleLibrary {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("data/employee.json");

//        Object obj = jsonParser.parse(fileReader);  // convert json file into java object
//        JSONObject jsonObject = (JSONObject)obj;  // JAVA -->json Object
        // or
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader); // Converting jsonFile --> Json Object
        long Ppage = (long) jsonObject.get("page");
        long Pper_page = (long) jsonObject.get("per_page");
        long Ptotal = (long) jsonObject.get("total");
        long PtotalPages = (long) jsonObject.get("total_pages");
        System.out.println(Ppage);
        System.out.println(Pper_page);
        System.out.println(Ptotal);
        System.out.println(PtotalPages);

        // person data  (json array)
        JSONArray dataArray = (JSONArray) jsonObject.get("data");

        for (int i = 0; i < dataArray.size(); i++) {
            JSONObject dataValue = (JSONObject) dataArray.get(i);
            long id = (long) dataValue.get("id");
            String email = (String) dataValue.get("email");
            String fname = (String) dataValue.get("first_name");
            String lname = (String) dataValue.get("last_name");
            String avatar = (String) dataValue.get("avatar");


            System.out.println("id:" + id);
            System.out.println("email:" + email);
            System.out.println("first_name:" + fname);
            System.out.println("last_name:" + lname);
            System.out.println("avatar:" + avatar);
        }

        // support
        JSONObject supportObject = (JSONObject) jsonObject.get("support");
        String url = (String) supportObject.get("url");
        String text = (String) supportObject.get("text");
        System.out.println("url:" + url);
        System.out.println("text:" + text);


    }
}
