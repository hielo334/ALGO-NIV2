import java.util.Scanner;

public class boucledowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean reponseCorrecte;
        do {
            System.out.print("Combien font 3 + 2 ? ");
            int reponseMath = scanner.nextInt();
            scanner.nextLine(); 
        
            if (reponseMath == 5) {
                System.out.println("Bonne réponse.");
                reponseCorrecte = true;
            } else {
                System.out.println("Mauvaise réponse.");
                reponseCorrecte = false;
            }
        } while (!reponseCorrecte); 
        do {
            System.out.print("Quelle est la capitale de l'Espagne ? ");
            String reponseCapitale = scanner.nextLine();
            
            if (reponseCapitale.equalsIgnoreCase("Madrid")) {
                System.out.println("Bonne réponse.");
                reponseCorrecte = true;
            } else {
                System.out.println("Mauvaise réponse.");
                reponseCorrecte = false;
            }
        } while (!reponseCorrecte);

        scanner.close();
    }
}