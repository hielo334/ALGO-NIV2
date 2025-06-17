/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * 
 * Merci poru votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */
import java.util.Scanner;

public class exo1 {

    public static void main(String[] args) {
       
        Scanner clavier = new Scanner(System.in);

  
        boolean viande = false;
        boolean saignant = false;
        boolean frites = false;
        boolean soda = false;



        for(int i=1; i<=4; i++){

            switch(i){

                case 1:System.out.println("Bonjour, votre commande est avec viande (true) ou vegetarien (false)"); 
                     viande = clavier.nextBoolean(); break;
                case 2:if(viande) {
                     System.out.println("Votre steak vous le voulez saignant (true) ou à point (false) ?"); 
                     saignant = clavier.nextBoolean();} break;
                case 3:System.out.println("Frites (true) ou riz (false)");
                    frites = clavier.nextBoolean();
                    clavier.nextLine();
                    break;
                case 4:System.out.println("Soda (true) ou eau gazeuse (false)");
                    soda = clavier.nextBoolean();
                    clavier.nextLine();
                    break;
                }
                
            }

            System.out.println("\nMerci pour votre commande, ça sera prêt dans 20min.");
            System.out.println("recaputalatif de votre commande");
        if(viande){
            System.out.println(saignant ? "saignant" :"à point");
         }
            System.out.println(frites ? "Frites" : "Riz");
            System.out.println(soda ? "Soda" : "Eau gazeuse");

         clavier.close();
    }
}


