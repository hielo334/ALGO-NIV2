/* Niveau 3 : A l'aide d'une boucle, PRINT & SCANNER 
*Imiter un distributeur de banque qui s'arrête uniquement 
quand vous appuyez, terminer(0). Voici les commandes suivantes

0 - Terminer
1 - Retirer
2 - Afficher compte
3 - Déposer

vous avez droit à un découvert de maximum 500€
Vous ne pouvez déposer minimum 5€ et une somme divisible par 5 (vu que c'est des billets)
Vous pouvez retirer qu'en multiple de 10


 * Vous avez 2000€ sur votre compte
 * 
 * La date et l'heure quel vous avez déposer ou retirer votre argent
 * 
 * utiliser exactement le meme code
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bienvenu sur votre compte bancaire, que puis-je faire pour vous :
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 1
 * 
 * Combien voulez-vous retirer ?:
 * 500€
 * 
 * Opération acceptée : 500€ ont été retiré,
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 2
 * 
 * Vous avez actuellement 1500€ sur votre solde
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 3
 * 
 * Combien voulez-vous retirer ?:
 * 577€
 * 
 * Désolé vous ne pouvez déposer que des billets
 * Voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 0
 * 
 * Merci de votre visite, au revoir :) !
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class exo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double solde = 2000;
        double DECOUVERT_AUTORISE = -500.0;
        
        System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous :");

        while (true) {
            System.out.println("(0)Quitter");
            System.out.println("(1)Retirer de l'argent");
            System.out.println("(2)Consulter votre solde");
            System.out.println("(3)Déposer de l'argent");
            System.out.print("\n");
            
            int choix = sc.nextInt();
            System.out.println();
            
            if (choix == 0) {
                break;
            }
            
            switch (choix) {
                case 1:
                    System.out.println("Combien voulez-vous retirer ?:");
                    double retrait = sc.nextDouble();
                    System.out.println();
                
                    if (retrait % 5 == 0) {
                        if (solde - retrait >= DECOUVERT_AUTORISE) {
                            solde -= retrait;
                            System.out.printf("Opération acceptée : %.0fEUR ont été retiré,\n", retrait);
                        } else {
                            System.out.println("\nOpération refusée : découvert dépassé");
                        }
                    } else {
                        System.out.println("Désolé vous ne pouvez retirer que des billets");
                    }
                    break;
                    
                case 2:
                    System.out.printf("Vous avez actuellement %.0fEUR sur votre solde\n", solde);
                    break;
                    
                case 3:
                    System.out.println("Combien voulez-vous déposer ?:");
                    double depot = sc.nextDouble();
                    System.out.println();
                    
                    if (depot % 5 == 0) {
                        solde += depot;
                        System.out.printf("Opération acceptée : %.0fEUR ont été déposé,\n", depot);
                    } else {
                        System.out.println("Désolé vous ne pouvez déposer que des billets");
                    }
                    break;
            }
            
            System.out.println("\nVoulez-vous autres-choses ?");
        }
        
        System.out.println("\nMerci de votre visite, au revoir :) !");
        sc.close();
    }
}