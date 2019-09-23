package zaverecnyProjekt.zapisovacDat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import zaverecnyProjekt.zamestnanci.Zamestnanec;
/**
 * Rozhranie urcenie pre pracu so subormi
 * @author Robert Chalcak
 *
 */
public interface IPracaSubory
{
   static final int VELKOST_INT=4;  //4bajty = 32 bitov
   static final int VELKOST_DOUBLE=8; //8 bajtov = 64 bitov
   static final int VELKOST_ZAZNAMU=VELKOST_INT+VELKOST_DOUBLE;   
   void zapis(ArrayList<Object>objs) throws FileNotFoundException, IOException;
   void nacitaj(ArrayList<Object> objs) throws IOException,
   ClassNotFoundException;
}
