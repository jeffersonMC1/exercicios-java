
package javaapplication2;

import java.util.Scanner;


public class atividade04 {
    
     public static void main(String args[]) {
         Scanner leia = new Scanner(System.in);
         int idade = 0;
         
         System.out.println("informe sua idade");
         System.out.println("1) de 5 a 7");
         System.out.println("2) de 8 a 10");
         System.out.println("3) de 11 a 13");
         System.out.println("4) de 14 a 17");
         System.out.println("5) maior de idade");
         idade = leia.nextInt();
         
         if (idade == 1)
         {
             System.out.println("sua categoria é:INFANTIL A DE 5 A 7 ANOS.");
         }
         if (idade == 2)
         {
             System.out.println("sua categoria é:INFANTIL B DE 8 A 10");
         }
         
         if (idade == 3)
         {
             System.out.println("sua categoria é:INFANTO JUVENIL DE 11 A 13 ANOS");
         }
         if (idade == 4)
         {
             System.out.println("sua categoria é:JUVENIL DE 14 A 17");
         }
         if (idade == 5)
         {
             System.out.println("sua categoria é:SENIIOR MAIIOR DE IDADE");
         }
                 
         
     }
    
}
