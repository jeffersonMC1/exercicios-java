
package FUNÇÕES;

import java.util.Scanner;


public class função04 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        
        System.out.println("Diga o valor de A: ");
        a = ler.nextDouble();
        
        System.out.println("Diga o valor de B: ");
        b = ler.nextDouble();
        
        System.out.println("Diga o valor de C: ");
        c = ler.nextDouble();
        
        double delta = calcula(a,b,c);
        valor(delta,a,b);
}
    
    public static double calcula(double a, double b, double c){
        double delta;
        delta = Math.pow(b, 2) - (4*a*c);
        double x1 = (-b) - (delta/2);
        double x2 = (-b) + (delta/2);
        return delta;
    }
    public static void valor (double total, double x1, double x2) {
        if (total < 0 ){
            System.out.println("Nao existe raiz real! ");
        }
        if (total == 0){
            System.out.println("Raiz unica!");
        }
        if (total > 0)
            System.out.println("X1 = " + x1 + "X2 = " + x2 );
    }

    
}
