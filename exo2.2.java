import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        List<String> articles = new ArrayList<>();
        List<Double> prixList = new ArrayList<>();
        
        System.out.println("Bonjour, que voulez-vous acheter ? :");
        
        boolean continuer = true;
        while(continuer) {
            System.out.println("\nOptions :");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Supprimer un article");
            System.out.println("3. Terminer les achats");
            System.out.print("Choisissez une option (1-3) : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(choix) {
                case 1: // Ajouter un article
                    System.out.print("\narticle : ");
                    String article = scanner.nextLine();
                    
                    System.out.print("Prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); 
                    
                    articles.add(article);
                    prixList.add(prix);
                    total += prix;
                    System.out.println("Article ajouté .");
                    break;
                    
                case 2: // Supprimer un article
                    if(articles.isEmpty()) {
                        System.out.println("\nLa liste est vide.");
                        break;
                    }
                    
                    System.out.println("\nListe des articles :");
                    for(int i = 0; i < articles.size(); i++) {
                        System.out.println((i+1) + ". " + articles.get(i) + " - " + String.format("%.2f", prixList.get(i)) + " EUR");
                    }
                    
                    System.out.print("\nEntrez le numéro de l'article à supprimer : ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine(); // consommer la nouvelle ligne
                    
                    if(index >= 0 && index < articles.size()) {
                        total -= prixList.get(index);
                        articles.remove(index);
                        prixList.remove(index);
                        System.out.println("Article supprimé. ");
                    } else {
                        System.out.println("Numéro invalide.");
                    }
                    break;
                    
                case 3: // Terminer
                    continuer = false;
                    break;
                    
                default:
                    System.out.println("Option invalide.");
            }
        }
        
        // Affichage du récapitulatif
        System.out.println("\nListe de vos courses : ");
         {for(int i = 0; i < articles.size(); i++)
            System.out.println((i+1) + ". " + articles.get(i) + " - " + String.format("%.2f", prixList.get(i)) + " EUR");
        }
        System.out.printf("\nTotal : %.2f EUR\n", total);
        
        scanner.close();
    }
}