import java.util.Scanner;

public class boucleinfini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.print("Combien font 3 + 2 ? ");
            int reponse = scanner.nextInt();
            scanner.nextLine();
            if (reponse == 5) {
                System.out.println("Bonne réponse. ");
                break;
            } else {
                System.out.println("Mauvaise réponse. ");
            }
        }
        for (;;) { 
            System.out.print("Quelle est la capitale de l'Espagne ? ");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase ("Madrid")) {
                System.out.println("Bonne réponse. ");
                break; 
            } else {
                System.out.println("Mauvaise réponse. ");
            }
        }
        scanner.close();
    
    }
}