
package FUNÇÕES;

import java.util.Scanner;
public class função05 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double yeni = 0;
        double dolar = 0;
        double real;
        int op = 0;
        
        System.out.println("Qual conversao voce deseja realizar:  digite 1 para dolar"
                + "\n digite 2 para yeni");
        
        if (op == 1){
            System.out.println("Conversão em dolar");
            dolar = ler.nextDouble();
        }
        if (op == 2){
            System.out.println("Conversão em yeni ");
            yeni = ler.nextDouble();
        }  
        
        
}
     public static void converter(double yeni,double dolar, double real){
      
         dolar = real*0.30;
         yeni = real*30.00;
         
                 
     }
     
    
}
    
