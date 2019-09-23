package zaverecnyProjekt.zamestnanci;

public class MainMetoda
{

   public static void main(String[] args)
   {
        Zamestnanci zamestnanci = new Zamestnanci();
        
        zamestnanci.pridajZamestnanca(new Zamestnanec("Janko","Hrasko",1100));
        zamestnanci.pridajZamestnanca(new Zamestnanec("Pavol", "Maly",1152));
        zamestnanci.pridajZamestnanca(new Zamestnanec("Jana","Hlucha",950));
        
        System.out.println(zamestnanci.vratZosnamZamestnancov());
        
        System.out.println(zamestnanci.vyhladajZamestnanca("BO1"));
        
        System.out.println(zamestnanci.jeZamestnanec("BO3"));
        System.out.println(zamestnanci.jeZamestnanec("BO5"));
   }

}
