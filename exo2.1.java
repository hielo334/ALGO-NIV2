/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses
Définir la date et l'heure de vos course
utiliser exactement le meme code
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 * 
 * 
 */
import java.util.Scanner;

public class exo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        String recapCourses = ""; // stocker la liste

        System.out.println("Bonjour, que voulez-vous acheter ? :");
        
        boolean continuer = true;
        while(continuer) {
            // article
            System.out.print("");
            String article = scanner.nextLine();
            
            // prix
            System.out.print("Combien ça coûte ? :\n");
            double prix = scanner.nextDouble();
            total += prix;
            scanner.nextLine();

            
            
            
            // Demande de continuation
            System.out.print("Voulez-vous acheter autre chose (true/false)?\n");
            continuer = scanner.nextBoolean();
            scanner.nextLine();
            
            if(continuer) {
                System.out.println("Que voulez-vous acheter ?");


            }

            recapCourses += ". " + article + " . " + String.format("%.2fEUR\n", prix);
        }
    
        
        // Affichage du récapitulatif
        System.out.println("\nListe de vos courses : ");
        System.out.printf("\nTotal :%.2fEUR\n", total);
        System.out.println(recapCourses);
        
        scanner.close();
    }
}