package trabalho_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cadastros {

    Scanner leia = new Scanner(System.in);
    File arquivo = new File("C:\\Users\\aptec121t23\\Desktop\\file.txt");
    String nome = "";
    String filial = "";
    int vendas = 0;
    int cont1 = 0;
    int cont2 = 0;

    public void vendedor() {
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            String op = "S";
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            while (!op.equals("N")) {
                System.out.println("qual filial você deseja consultar?");
                System.out.println("ESTEIO");
                System.out.println("CANOAS");
                filial = leia.next();
                filial = filial.toUpperCase();

                if (filial.equals("ESTEIO")) {
                    while (true) {
                        System.out.println("informe o nome do vendedor:");
                        nome = leia.next();
                        nome = nome.toUpperCase();
                        if (nome.equals("ANA")) {
                            System.out.println("informe o total de vendas desse funcionario(a)");
                            vendas = leia.nextInt();
                            cont2 = vendas;
                            break;

                        }
                        if (nome.equals("PEDRO")) {
                            System.out.println("informe o total de vendas desse funcionario(a)");
                            vendas = leia.nextInt();
                            cont2 = vendas;
                            break;
                        }
                        if (nome.equals("JONAS")) {
                            System.out.println("informe o total de vendas desse funcionario(a)");
                            vendas = leia.nextInt();
                            cont2 = vendas;
                            break;
                        } else {
                            continue;
                        }
                    }

                }

                filial = filial.toUpperCase();

                if (filial.equals("CANOAS")) {
                    while (true) {
                        System.out.println("informe o nome do vendedor:");
                        String nome = leia.next();
                        nome = nome.toUpperCase();
                        if (nome.equals("ANA")) {
                            System.out.println("informe o total de vendas desse funcionario(a)");
                            vendas = leia.nextInt();
                            cont1 = vendas;
                            break;

                        }
                        if (nome.equals("PEDRO")) {
                            System.out.println("informe o total de vendas desse funcionario(a)");
                            vendas = leia.nextInt();
                            cont1 = vendas;
                            break;
                        }
                        if (nome.equals("JONAS")) {
                            System.out.println("informe o total de vendas desse funcionario(a)");
                            vendas = leia.nextInt();
                            cont1 = vendas;
                            break;
                        } else {
                            continue;
                        }
                    }
                }

                System.out.println("deseja continuar? S/N");
                op = leia.next();
                op = op.toUpperCase();

                bw.write(" filial do vendedor:" + filial);

                bw.write(" nome do vendedor:" + nome);

                bw.write(" valor mensal do vendedor de esteio:" + cont2);

                bw.write(" valor mensal de canoas:" + cont1);

                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("*************************************");
    }

    public void consulta() {
        try {

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void consulta_total() {
        int cont3 = 0;

        cont3 = cont1 + cont2;

        System.out.println("total das vendas:" + cont3);
    }

    public void limpa() {
        for (int i = 0; i < 1; i++) {
            System.out.println("*******************************************************");
        }
    }

}
