package senhas;

import java.util.Scanner;

public class senha01 {

    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        String senha = "";
        int minuscula = 0;
        int maiuscula = 0;
        int e = 0;
        int numero = 0;
        int total = 0;
        int T = 0;
        int limite = 5;

        System.out.print("infrome uma senha:");
        senha = leia.next();
        while (T > limite) {
             System.out.print("infrome uma senha:");
        senha = leia.next();
            
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);

                if ('0' <= c && c <= '9') {
                    System.out.println("numero: " + c);
                    numero++;
                }
                if ('a' <= c && c <= 'z') {
                    System.out.println("letra minuscula: " + c);
                    minuscula++;
                }
                if ('A' <= c && c <= 'Z') {
                    System.out.println("Letras maiuscula: " + c);
                    maiuscula++;
                } else {
                    System.out.println("caracter especial: " + c);
                    e++;
                }
            }

            if (T == limite) {

                if (numero > 1 && e >= 1 && total > 8) {
                    System.out.println("senha ok");

                } else {
                    System.out.println("senha invalida");
                    T++;
                }

                if (T == 5) {
                    System.out.print("numero de tentativas limite alcançado");
                    break;
                } else {
                    total = minuscula + maiuscula + e + numero;
                    System.out.println("total minusculas: " + minuscula);
                    System.out.println("total de maiuscullas; " + maiuscula);
                    System.out.println("total de esciais: " + e);
                    System.out.println("total de numero: " + numero);
                    break;
                }
            }
        }

    }
}
