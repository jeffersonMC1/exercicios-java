package FUNÇÕES;

import java.util.Scanner;

public class função01 {
    public static void main(String args[]) {
       Scanner leia = new Scanner(System.in);
       double valor = 0;
       double resultado = 0;
       
       System.out.println("insira o numero:");
       valor = leia.nextDouble();
       resultado = calcula(valor);
       
       System.out.println("o quadro do numero digitado eh: " + resultado);
 
    }
    
    public static double calcula(double numero){
        
        double resultado = Math.pow(numero, 2);
        return resultado;
     
    }

}
