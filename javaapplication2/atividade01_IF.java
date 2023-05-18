
package javaapplication2;

import java.util.Scanner;


public class atividade01_IF {
  
    public static void main(String args[]) {
       
       Scanner leia = new Scanner(System.in);
        int num = 0;
        double quant1 = 1.20;
        double quant2 = 1.70;
        double acum = 0;
        
        System.out.println("informe um valor numerico de maças que deseja comprar:");
        num = leia.nextInt();
        
        if (num >= 13)
        {
            acum = num * quant1;
            System.out.println("o valor total a pagar será:" + acum);
        }
        else
        {
            acum = num * quant2;
            System.out.println("o valor total a pagar será:" + acum);
        }
   
   }
}
