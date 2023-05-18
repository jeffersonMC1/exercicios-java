
package aula_java;

import java.util.Scanner;


public class while01 {
    
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
          int num = 0;
          int acum = 0;
          
          while (num > 0)
          {
              System.out.println("informe um numero:");
              num = leia.nextInt();
           
           if (num > 0)
           {
               acum = acum + num;
           }
          }
        
          System.out.println("ijasfajsdaj   " + acum);
          
          
    }
    
}
