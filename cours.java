import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class cours {
    public static void main(String[] args) {
        // 1. Boucle de 1 à 10
        System.out.println("Compte de 1 à 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. Date du jour au format JJ/MM/AA
        System.out.println("\nDate d'aujourd'hui:");
        LocalDate aujourdhui = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(aujourdhui.format(formatter));

        // 3. Division par zéro avec gestion d'erreur
        System.out.println("\nTest division par zéro:");
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Erreur: Division par zéro");
        }
    }
}

