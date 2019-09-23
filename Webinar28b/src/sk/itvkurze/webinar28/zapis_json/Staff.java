package sk.itvkurze.webinar28.zapis_json;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Staff
{
     private String name;
     private int age;
     private String[]position;                //pole
     private List<String>skills;              // zoznam, list
     private Map<String, BigDecimal>salary;   //mapa ->hodnota
     
     public String getName()
     {
        return name;
     }
     
     public void setName(String name)
     {
        this.name=name;
     }
     
     public int getAge()
     {
        return age;
     }

   public String[] getPosition()
   {
      return position;
   }

   public void setPosition(String[] position)
   {
      this.position = position;
   }

   public List<String> getSkills()
   {
      return skills;
   }

   public void setSkills(List<String> skills)
   {
      this.skills = skills;
   }

   public Map<String, BigDecimal> getSalary()
   {
      return salary;
   }

   public void setSalary(Map<String, BigDecimal> salary)
   {
      this.salary = salary;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   @Override
   public String toString()
   {
      return "Staff [name=" + name + ", age=" + age + ", position="
            + Arrays.toString(position) + ", skills=" + skills + ", salary="
            + salary + "]";
   }
   
   
}
