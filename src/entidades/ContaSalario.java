package entidades;

public class ContaSalario extends Conta {

	private Double limiteCredito;
	
	public ContaSalario() {
		super();
	}
	public ContaSalario(String name, String email, int numConta, Double valorInicial, double limiteCredito) {
		super(name, email, numConta, valorInicial);
		this.limiteCredito = limiteCredito;
	}

	public Double getlimiteCredito() {
		return limiteCredito;
	}

	public void setLoanLimit(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public String toString() {
		return "  Conta " + numConta + "\n  Nome: " + name + "\n  Email: "+ email + "\n  Saldo: $" + String.format("%.2f", saldoConta)+"\n  Limite de credito: "+String.format("%.2f", limiteCredito);
	}
	
}