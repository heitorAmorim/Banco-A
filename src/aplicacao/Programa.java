package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		char c;
		System.out.println("Bem Vindo ao Banco A!");
		System.out.println("Qual Operação deseja fazer?");
		
		do { //primeiro laço, pergunta qual operação a pessoa deseja fazer
			
			System.out.println("Abrir conta - 1");
			System.out.println("");
			System.out.println("Calcular emprestimo - 2");
			System.out.println("");
			System.out.println("Sair - 3");
			x = sc.nextInt();
			
			if(x < 1 || x > 3) { // tratamento de erro, caso o usuario digite uma opção invalida, ele mostra a mensagem
				System.out.println("Digite um numero valido!");
			}
			
		} while (x < 1 || x > 3); // condição do laço, usuario so sai do do while quando digita uma opção valida
		
		if(x == 1) { // usuario escolhendo a primeira opção cai nesse if else, digitando as informações para criar uma conta
			
			System.out.println("Para abrir uma conta digite as informaçôes abaixo:");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			System.out.print("Email: ");
			String email = sc.nextLine(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			System.out.print("Numero Conta: ");
			int numConta = sc.nextInt(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			System.out.print("Saldo inicial: ");
			Double valorInicial = sc.nextDouble(); // varialvel 'temporaria', somente para pegar os dados para serem passados
			
			Conta conta = new Conta(name, email, numConta, valorInicial); //criação do objeto
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
					System.out.println("Operação finalizada");
				}
				
			} while (c != 'e');
		}
		
		sc.close();
	}	
}
