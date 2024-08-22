package entidade_;

public class ContaCorrente {

	private String nomeContaCorrente;
	private double saldo;
	private int numeroContaCorrente;
	private double limite;
	

	public ContaCorrente(String nomeContaCorrente, double saldo, int numeroContaCorrente, double limite) {

		this.nomeContaCorrente = nomeContaCorrente;
		this.saldo = saldo;
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	public ContaCorrente(String nomeContaCorrente2, double saldo2, int numeroContaCorrente2) {
		// TODO Auto-generated constructor stub
	}

	public double sacar (double saque) {
		return saque = saque - saldo;

	}
	
	public double deposito (double deposito) {
		return deposito = deposito + saldo;
	}



	@Override
	public String toString() {
		return "ContaCorrente [nome=" + nomeContaCorrente + ", saldo=" + saldo + ", numero="
				+ numeroContaCorrente + "]" + limite + "limite";
	}
	
	 
	
	
		
	
}
