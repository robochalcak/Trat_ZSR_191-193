package sk.itvkurze.webinar28.zapis_json;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester
{

   public static void main(String[] args)
   {
       ObjectMapper mapper = new ObjectMapper();
       Staff staff = vytvorData();
       
       //Java object -> jSON subor
       try
      {
         mapper.writeValue(new File("staff.json"), staff);
         
         //java objekt -> json-ovska reprezentacia stavu objektu Staff->ako String
         String jsonString = mapper.writeValueAsString(staff);
         //zobrazime json na standardny vystup -> zobrazeny bude len oneliner
         System.out.println(jsonString);
         
         //Java objekt -> json string pretty print
         
         String  jsonStringPretty = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
         System.out.println();
         System.out.println(jsonStringPretty);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }

   private static Staff vytvorData()
   {
      Staff staff = new Staff();
      staff.setName("Peter Novak");
      staff.setAge(25);
      staff.setPosition(new String[] { "Director", "CTO", "Sales Manager" });
/*
      Map<String, BigDecimal> vyplaty = new HashMap<>() //inicializacia mapy
      {
         {
            put("2017", new BigDecimal(15000));
            put("2018", new BigDecimal(16500));
            put("2019", new BigDecimal(18200));
         }

      };
     */ 
      Map<String, BigDecimal>vyplaty=new HashMap<>(); //definicia mapy
      vyplaty.put("2017", new BigDecimal(15000));
      vyplaty.put("2018", new BigDecimal(16500));
      vyplaty.put("2019", new BigDecimal(18200));
      
      staff.setSalary(vyplaty);
      staff.setSkills(Arrays.asList("java","node.js","React.js","MySQL"));
      
      return staff;

   }
   
   

}
