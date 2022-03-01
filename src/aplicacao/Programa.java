package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		char c;
		System.out.println("Bem Vindo ao Banco A!");
		System.out.println("Qual Opera��o deseja fazer?");
		
		do { //primeiro la�o, pergunta qual opera��o a pessoa deseja fazer
			
			System.out.println("Abrir conta - 1");
			System.out.println("");
			System.out.println("Calcular emprestimo - 2");
			System.out.println("");
			System.out.println("Sair - 3");
			x = sc.nextInt();
			
			if(x < 1 || x > 3) { // tratamento de erro, caso o usuario digite uma op��o invalida, ele mostra a mensagem
				System.out.println("Digite um numero valido!");
			}
			
		} while (x < 1 || x > 3); // condi��o do la�o, usuario so sai do do while quando digita uma op��o valida
		
		if(x == 1) { // usuario escolhendo a primeira op��o cai nesse if else, digitando as informa��es para criar uma conta
			
			System.out.println("Para abrir uma conta digite as informa��es abaixo:");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			System.out.print("Email: ");
			String email = sc.nextLine(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			System.out.print("Numero Conta: ");
			int numConta = sc.nextInt(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			System.out.print("Saldo inicial: ");
			Double valorInicial = sc.nextDouble(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			
			Conta conta = new Conta(name, email, numConta, valorInicial); //cria��o do objeto
			System.out.println(conta);
			
			do {
				
				System.out.println("Deseja fazer um deposito ou saque?");
				System.out.println("Digite 's' para saque, 'd' para deposito ou 'e' para sair");
				c = sc.next().charAt(0);
				
				while (c != 's' && c != 'd' && c != 'e') {
					
					System.out.println("Digite uma alternativa valida!");
					System.out.println("Digite 's' para saque, 'd' para deposito ou 'e' para sair");
				}
				
				if(c == 'd') {
					System.out.println("Valor do deposito");
					double valorDeposito = sc.nextDouble(); 
					conta.deposito(valorDeposito);
				} else if(c == 's') {
					System.out.println("Valor do saque");
					double valorSaque = sc.nextDouble(); 
					conta.saque(valorSaque);
				} else {
					System.out.println(conta);
					System.out.println("Opera��o finalizada");
				}
				
			} while (c != 'e');
		}
		
		sc.close();
	}	
}
