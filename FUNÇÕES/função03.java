
package FUNÇÕES;

import java.util.Scanner;

public class função03 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double dist;
        double gas;

        System.out.println("Digite a distancia percorida em km: ");
        dist = ler.nextDouble();
        System.out.println("Digite o consumo de gasolina do carro: ");
        gas = ler.nextDouble();

        double consumo = calcular_consumo(dist, gas);
        tabela(consumo);

    }

    public static double calcular_consumo(double dist, double gas) {
        double result = dist / gas;
        return result;
    }

    public static void tabela(double consumo) {
        if (consumo < 8) {
            System.out.println("Consumo foi de: " + consumo + "km/l " + "Venda o carro!");
        }
        if (consumo >= 8 && consumo < 14) {
            System.out.println("Consumo foi de: " + consumo + "km/l " + "Economico");
        }
        if (consumo > 14) {
            System.out.println("Consumo foi de: " + consumo + "km/l " + "Super economico");
        }
    }

}
