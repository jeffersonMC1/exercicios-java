
package javaapplication2;

import java.util.Scanner;


public class atividade03 {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int D = 0;
        
        System.out.println("informe o primeiro valor:");
        num1 = leia.nextInt();
        
        System.out.println("informe um segundo valor:");
        num2 = leia.nextInt();
        
        D = num1 - num2;
        
        if (num1 >= num2)
        {
            System.out.println("o maior numero é:" + num1);
            System.out.println("a diferença entre eles é;" + D);
        }
        else
        {
            System.out.println("o maior numero é:" + num2);
             System.out.println("a diferença entre eles é;" + D);
        }
    
    }
    
}
