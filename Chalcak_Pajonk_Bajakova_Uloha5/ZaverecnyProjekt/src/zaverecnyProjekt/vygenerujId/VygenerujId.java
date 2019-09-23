package zaverecnyProjekt.vygenerujId;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Vygeneruje id pre klientov a ucty aby bolo mozne ich nasledne
 * indentifikovat a sparovat 
 * @author Robert Chalcak
 *
 */
public interface VygenerujId
{
    void vygenerujId(Object obj) throws FileNotFoundException, ClassNotFoundException, IOException;
  
}
