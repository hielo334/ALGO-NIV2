
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */


/*  Faire un compteur de 30 (ou un nombre au choix) jusqu'à 0 */

public class Compteur {

      public static void main(String[] args) {

            int i;
            Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
            */

            System.out.println("Point de barré de la décrémentation");


            /*Compteur FOR */ 
            for(i = clavier.nextInt();i>=0;i--){

             System.out.println("compteur à "+i);

            }

            clavier.close();




        }
    
}
