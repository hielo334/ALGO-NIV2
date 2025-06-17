
import java.util.Scanner;

public class QuizzFor {


           public static void main(String[] args) {

            Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
            */
            String response="";
        

            /*Compteur FOR , boucle infini avec For*/ 
            for(;;){
                System.out.println("Quel est la Capital de la France ?");

                response = clavier.nextLine();

                if (response.equalsIgnoreCase("Paris")) {

                 System.out.println("Bonne réponse :) !");  
                 break; /* Break pour arrêter la boucle */              
                    
                }else{

                  System.out.println("Mauvaise réponse :( !");                     

                }
                

            }


        }

    
}
