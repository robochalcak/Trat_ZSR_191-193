package sk.itvkurze.webinar28.zapis_json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReaderJsonTester
{

   public static void main(String[] args)
   {
      ObjectMapper mapper = new ObjectMapper();
      
      try
      {
         //json subor (staff.json) ->Objekt typu staff
        Staff staff= mapper.readValue(new File("staff.json"), Staff.class);
         // data ako string->objekt typu Staff
        
        String jsonString = "{\"name\":\"Peter Novak\", \"age\":24,\"skills\":[\"java\",\"React\",\"C++\"]}";
        Staff staff2 = mapper.readValue(jsonString, Staff.class);
        
        //zobra na standardtny vystup 
        
      //  System.out.println(staff2); 
        System.out.println(staff);
        
        //zobra na standartny vystup -> pretty print
        
       // String  jsonStringPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);
        String  jsonStringPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
        System.out.println();
        System.out.println(jsonStringPretty);
         
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

}
