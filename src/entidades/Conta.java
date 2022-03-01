package entidades;

public class Conta {
	
	private String name;
	private String email;
	private int numConta;
	private double saldoConta;
	
	public Conta(String name, String email, int numConta, double valorInicial) {
		
		this.name = name;
		this.email = email;
		this.numConta = numConta;
		deposito(valorInicial);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getNumConta() {
		return numConta;
	}
	
	public void deposito(double valorInicial) {
		saldoConta += valorInicial;
		}
	
	public void saque(double valorSaque) {
		saldoConta -= valorSaque + 5.0;
	}
	
	
	public String toString() {
		return "Conta " + numConta + ", Nome: " + name + ", Email: "+ email + ", Saldo: $" + String.format("%.2f", saldoConta);
	}

}