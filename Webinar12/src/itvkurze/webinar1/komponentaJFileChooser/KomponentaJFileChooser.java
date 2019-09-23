package itvkurze.webinar1.komponentaJFileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class KomponentaJFileChooser
{

   public static void main(String[] args)
   {
      JFileChooser navigator = new JFileChooser(FileSystemView
            .getFileSystemView().getHomeDirectory());
      navigator.setFileSelectionMode(JFileChooser.FILES_ONLY);

      navigator.setDialogTitle("Vyber nejaky obrazok");

      navigator.setMultiSelectionEnabled(true);

     // navigator.setAcceptAllFileFilterUsed(false);

      FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Obrazky.jpg a png", "jpg", "png");

      navigator.addChoosableFileFilter(filter);

      int idTlacitka = navigator.showOpenDialog(null);

      // klikol na tlacitko OK?

      if (idTlacitka == JFileChooser.APPROVE_OPTION)
      {
         File[] oznaceneSubory = navigator.getSelectedFiles();

         for (File subor : oznaceneSubory)
         {
            System.out.println("Zvolil si subor: " + subor.getAbsolutePath());
         }
      }

   }

}
