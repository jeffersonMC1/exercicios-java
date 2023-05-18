package trabalho_final;

import java.util.Scanner;


public class menu {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		cadastros cad = new cadastros();
        
		int op = 0;
		String senha = "";
        int i = 0;
				
		while (true) 
		{
			
			System.out.println("informe a senha:");
			senha = leia.next();
			senha = senha.toUpperCase();
			
			if (senha.equals ("SENACTI"))
			{
				
			System.out.println("senha correta");
			
			}
			
			else
			{
				System.out.println("senha incorreta");
				continue;
			}
			
			cad.limpa();
			
			System.out.println("* * * Menu Principla * * *");
			System.out.println(" 1- cadastrar");
			System.out.println(" 2- consultar");
			System.out.println(" 3- consultar e totalizar");
			System.out.println(" 4- Sair");
			
			op = leia.nextInt();

			if (op == 1) {
				cad.vendedor();
			}
			if (op == 2) {
				cad.consulta();
			}
			if (op == 3)
			{
				cad.consulta_total();
			}
			if (op == 4)
				
			{
				break;
			}
		}
        
		System.out.println("* * * FIM * * *");
	}

}