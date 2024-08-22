package entidade_;

public class Conta_Pouupanca {
 
	private String nomepoupanca;
	private double saldo; 
	private int numeropoupanca;
	

	public double sacar (double saque) {
		return saque = saldo - saque;
		
	}
	
	public double deposito (double deposito) {
		return deposito = saldo + deposito;
	}

	public Conta_Pouupanca(String nomepoupanca, double saldo, int numeropoupanca) {
		super();
		this.nomepoupanca = nomepoupanca;
		this.saldo = saldo;
		this.numeropoupanca = numeropoupanca;
	}
	
	@Override
	public String toString() {
		return "Conta_Pouupanca [nomepoupanca=" + nomepoupanca + ", saldo=" + saldo + ", numeropoupanca="
				+ numeropoupanca + "]";
	}
	

	public Conta_Pouupanca() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	

}
