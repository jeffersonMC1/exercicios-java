
package javaapplication2;

import java.util.Scanner;


public class atividade05 {
    
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        
        double alt = 0;
        double massa = 0;
        
        System.out.println("qual a sua altura?");
        alt = leia.nextDouble();
        
        System.out.println("qual o seu peso?");
        massa = leia.nextDouble();
        
        double IMC = (massa/(alt * alt));
        
        if (IMC <= 18.5)
        {
            System.out.println("você esta a baixo do peso");
        }
        
        if (IMC >= 18.6 && IMC <=24.9)
        {
            System.out.println("você é saudavel");
        }
        if (IMC >= 25.0 && IMC <= 29.9)
        {
            System.out.println("você esta acima do peso");
        }
        if (IMC >= 30.0 && IMC <= 34.9)
        {
            System.out.println("obesidade grau 1");
        }
        if (IMC >= 35.0 && IMC <= 39.9)
        {
            System.out.println("obesidade grau 2(severa)");
        }
        if (IMC > 40)
        {
            System.out.println("obesidade grau 3 (morbida)");
        }
        
        
    }
   
}
