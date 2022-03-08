package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaSalario;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char c;
		Conta conta;
		
		System.out.println("Bem Vindo ao Banco A!");
		System.out.println("Para abrir uma conta digite as informações abaixo:");
		System.out.println("Tipo da conta 1 - conta padrão / 2 = conta salário");
		int tipoConta = sc.nextInt();
		
		System.out.print("\n");
		System.out.print("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Numero Conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Saldo inicial: ");
		double valorInicial = sc.nextDouble();
		
		if(tipoConta == 1) {
			System.out.print("\n");
			 conta = new Conta(name, email, numConta, valorInicial);
			System.out.println(conta);
		} else {
			System.out.print("Limite de credito: ");
			double limiteCredito = sc.nextDouble();
			conta = new ContaSalario(name, email, numConta, valorInicial, limiteCredito);
			System.out.print("\n");
			System.out.println(conta);
		}
		System.out.println("\nDeseja fazer um deposito ou saque?");
		do {
			System.out.println("Digite 's' para saque, 'd' para deposito ou 'e' para sair");
			c = sc.next().charAt(0);
			
			while (c != 's' && c != 'd' && c != 'e') {
				System.out.println("\nDigite uma alternativa valida!");	
				System.out.println("Digite 's' para saque, 'd' para deposito ou 'e' para sair");
			}
			
			if(c == 'd') {
				System.out.println("\nValor do deposito");
				double valorDeposito = sc.nextDouble(); 
				conta.deposito(valorDeposito);
				double novoSaldo = conta.getSaldoConta();
				System.out.println("Novo Saldo:"+ novoSaldo);
			} else if(c == 's') {
				System.out.println("\nValor do saque");
				double valorSaque = sc.nextDouble(); 
				conta.saque(valorSaque);
				double novoSaldo = conta.getSaldoConta();
				System.out.println("Novo Saldo:"+ novoSaldo);
			} else {
				System.out.println(conta);
				System.out.println("Operação finalizada");
				}
			
		} while (c != 'e');
		sc.close();
		}
	}
