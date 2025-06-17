import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ttelesdates {
  public static void main(String[] args) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    System.out.println("yyyy/MM/dd HH:mm:ss-> " + dtf.format(LocalDateTime.now()));

    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
    System.out.println("yy/MM/dd HH:mm:ss-> " + dtf2.format(LocalDateTime.now()));

    DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
    System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

    DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    System.out.println("yyyy/MM/dd HH:mm-> " + dtf4.format(LocalDateTime.now()));

    DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
    System.out.println("yyyy/MM/dd hh:mm:ss-> " + dtf5.format(LocalDateTime.now()));
  }
}

//* 1. Boucle qui compte de 1 à 10

POUR i DE 1 À 10 FAIRE
    AFFICHER i
FIN POUR
*/
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

//*2. Afficher la date d'aujourd'hui au format JJ/MM/AA

dateAujourdhui = DATE_DU_JOUR
AFFICHER FORMATER(dateAujourdhui, "JJ/MM/AA")

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

LocalDate aujourdhui = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
System.out.println(aujourdhui.format(formatter));

//* 3. Tester une division par 0 et catcher l'erreu*/

ESSAYER
    resultat = 10 / 0
    AFFICHER resultat
ATTRAPER (Exception e)
    AFFICHER "Erreur: Division par zéro"
FIN ESSAYER

try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Erreur: Division par zéro");
    // e.printStackTrace(); // Pour afficher plus de détails sur l'erreur
}


