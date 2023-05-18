
package javaapplication2;

import java.util.Scanner;


public class avaliação {
    
     public static void main(String args[]) {
         Scanner leia = new Scanner(System.in);
         double D = 0;
         double Vl = 0;
         double T = 0;
         double L = 0;
    
         System.out.println("em quanto tempo você concluiu seu percurso?");
         T = leia.nextDouble();
         
         System.out.println("a quantos quilometros HR você estava?");
         Vl = leia.nextDouble();
         
         D = T * Vl;
         
         System.out.println("você percoreu:" + D + " quilometros de distancia");
         
         L = D / 12;
         
         System.out.println("você gastou:" + L + " litros de combustivel");
         
     }
    
}
