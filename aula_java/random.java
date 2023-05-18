
package aula_java;

import java.util.Random;
import java.util.Scanner;


public class random {
     public static void main(String args[]) {
         Scanner leia = new Scanner(System.in);
         Random random = new Random();
         
         int numero = 0;
         int i = 0;
         
         int aleatorio = random.nextInt(500);
         
         
         while (numero !=  aleatorio){
            
         System.out.println("Digite o numero sorteado de 0 a 500");
         numero = leia.nextInt();
         
             if (numero < aleatorio)
             {
                 System.out.println("o  numero é maior");
                 i++;
             }
            if (numero > aleatorio)
             {
                 System.out.println("numero é menor");
                 i++;
             }
         }
         
         if (i >= 1 && i <= 3)
         {
             System.out.print(i + " tentativas, muito sortudo.");
         }
         if (i >= 4 && i <=6)
         {
             System.out.println(i + " tentativas, sortudo");
         }
         if (i >= 7 && i <=10)
         {
             System.out.println(i + " tentativas,normal...");
               
         }  
         if (i >10) 
         {
             System.out.print(i + " tentativas, tente novamente...");
         }
                
         
         
         
     }
    
}
