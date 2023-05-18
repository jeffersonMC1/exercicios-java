
package aula_java;

import java.util.Scanner;


public class whilesenha {
    
     public static void main(String args[]) {
         Scanner leia = new Scanner(System.in);
         int senha = 0;
         
         while (senha != 1234){
         
             System.out.print("informe uma senha de 4 digitos:");
             senha = leia.nextInt();
             
             if (senha == 1234)
             {
                 System.out.println("senha correta");
             }
             else
             {
                 System.out.println("senha incorreta, tente novamente:");
             }
         }
         
     }
    
}
