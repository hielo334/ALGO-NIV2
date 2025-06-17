

import java.util.Scanner;

public class QuizzDoWhile {

           public static void main(String[] args) {

            boolean response = true;

            Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                   
            */
            
            do{
                
                 System.out.println("Est-ce que le IF ELSE est une boucle ?");

                 response = clavier.nextBoolean();

                 if(!response == true){

                   System.out.println("Bonne réponse :) !");          

                 }else{

                    System.out.println("Mauvaise réponse :( !");    
                 }
                  
               
            }
            
            while(response==true); /* Tant que c'est VRAI la boucle ne s'arrête pas */



                        clavier.close();


        }
    
}
