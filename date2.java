import java.util.Scanner;
import java.time.LocalDateTime;  // Pour la date et l'heure
import java.time.format.DateTimeFormatter;  // Pour formater la date/heure

public class date2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        String recapCourses = ""; // Pour stocker la liste des courses
        
        
        // Obtenir la date et heure actuelle
        LocalDateTime maintenant = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dateHeure = maintenant.format(formatter);

        System.out.println("Bonjour, que voulez-vous acheter ? :");
        
        boolean continuer = true;
        while(continuer) {
            // Saisie de l'article
            String article = scanner.nextLine();
            
            // Saisie du prix
            System.out.println("Combien ça coûte ? :");
            double prix = scanner.nextDouble();
            total += prix;
            scanner.nextLine(); 
            
            // Ajout à la liste de courses
            recapCourses += "-" + article + " , " + String.format("%.2f", prix) + " euros\n";
            
            // Demande si l'utilisateur veut continuer
            System.out.println("Voulez-vous acheter autre chose (true/false)?");
            continuer = scanner.nextBoolean();
            scanner.nextLine(); 
            
            if(continuer) {
                System.out.println("Que voulez-vous acheter ?");
            }
        }
        
        // Affichage du récapitulatif
        System.out.println("\nRécapitulatif de vos courses :");
        System.out.println("Date et heure : " + dateHeure + "\n");
        System.out.print(recapCourses);
        System.out.println("\nTotal de vos courses : " + String.format("%.2f", total) + "€");
        
        scanner.close();
    }
}


//*int compteur = 1; // Pour numéroter les articles */