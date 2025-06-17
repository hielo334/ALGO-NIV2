import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double solde = 2000;
        final double DECOUVERT_AUTORISE = -500.0;
        
        System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous :");

        while (true) {
            // Affichage du menu
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
                case 1: // Retrait
                    System.out.println("Combien voulez-vous retirer ?:");
                    double retrait = sc.nextDouble();
                    
                    // Vérification que le retrait est un multiple de 5 ou 10
                    if (retrait % 5 == 0 || retrait % 10 == 0) {
                        if (solde - retrait >= DECOUVERT_AUTORISE) {
                            solde -= retrait;
                            System.out.println("Opération effectuée le " + getCurrentDateTime());
                            System.out.printf("Opération acceptée : %.0fEUR ont été retiré,\n", retrait);
                        } else {
                            System.out.println("Opération refusée : découvert dépassé");
                        }
                    } else {
                        System.out.println("Désolé vous ne pouvez retirer que des multiples de 5 ou 10EUR");
                    }
                    break;
                    
                case 2: // Consultation solde
                    System.out.printf("Vous avez actuellement %.0fEUR sur votre solde\n", solde);
                    System.out.println("Dernière consultation le " + getCurrentDateTime());
                    break;
                    
                case 3: // Dépôt
                    System.out.println("Combien voulez-vous déposer ?:");
                    double depot = sc.nextDouble();
                    
                    if (depot >= 5 && depot % 5 == 0) {
                        solde += depot;
                        System.out.println("Opération effectuée le " + getCurrentDateTime());
                        System.out.printf("Opération acceptée : %.0fEUR ont été déposé,\n", depot);
                    } else {
                        System.out.println("Désolé vous ne pouvez déposer que des billets (minimum 5EUR, multiples de 5EUR)");
                    }
                    break;
                    
                default:
                    System.out.println("Option invalide");
            }
            
            System.out.println("\nVoulez-vous autres-choses ?");
        }
        
        System.out.println("\nMerci de votre visite, au revoir :) !");
        sc.close();
    }
    
    private static String getCurrentDateTime() {
        LocalDateTime maintenant = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return maintenant.format(formatter);
    }
}