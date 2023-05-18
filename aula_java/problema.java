package aula_java;

import java.util.Scanner;

public class problema {

    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        int voto = 0;
        int c = 0;
        int b = 0;
        int f = 0;
        int a = 0;
        int n = 0;
        int v = 0;
        int total = 0;
        int i = 0;
        double prgC = 0;
        double prgB = 0;
        double prgF = 0;
        double prgA = 0;
        double prgN = 0;
        
        while (voto != 999888) {
            
            System.out.println("***VOTO SINDICO 2023***");
            System.out.println("***ESCOLHA SEU CANDIDATO***");
            
            System.out.println("1-ciclano \n 2-beltrano \n 3-fulano \n 4-alano \n 5-voto nulo \n 6-voto branco");
            System.out.println("informe a opção que deseja");
            voto = leia.nextInt();
            
            if (voto == 999888) {
                break;
            } else {
                i++;
            }
            
            switch (voto) {
                case 1:
                    System.out.println("você votou ciclano");
                    c++;
                    prgC = i % c;
                    break;
                case 2:
                    System.out.println("você votou beltrano");
                    b++;
                    break;
                case 3:
                    System.out.println("você votou fulano");
                    f++;
                    break;
                case 4:
                    System.out.println("você votou alano");
                    a++;
                    break;
                case 5:
                    System.out.println("você votou nulo");
                    n++;
                    break;
                case 6:
                    System.out.println("você votou branco");
                    v++;
                    break;
            }
            if (voto > 7) {
                if (voto != 999888) {
                    n++;
                    System.out.print("seu voto foi anulado");
                }
            }
            for (int clear = 0; clear < 1; clear++) {
                System.out.println("*******************************************************");
            }
            System.out.println("obrigado por ter votado");
            System.out.println("seu voto faz a diferença");
            
            for (int clear = 0; clear < 1; clear++) {
                System.out.println("*******************************************************");
            }
        }
        
        for (int clear = 0; clear < 1; clear++) {
            System.out.println("*******************************************************");
        }
        System.out.println("o ciclano teve:" + c + " e a porcentagem de votos que ele teve foi:" + prgC);
        System.out.println("o beltrano teve:" + b);
        System.out.println("o fulano teve:" + f);
        System.out.println("o alano teve:" + a);
        System.out.println("o voto nulos teve:" + n);
        System.out.println("o votos em branco teve:" + v);
        
        for (int clear = 0; clear < 1; clear++) {
            System.out.println("*******************************************************");
        }
        total = c + b + a + f;
        System.out.println("total de votos validos feitos nesta eleição:" + total);
        
        for (int clear = 0; clear < 1; clear++) {
            System.out.println("*******************************************************");
        }
    }
    
}
