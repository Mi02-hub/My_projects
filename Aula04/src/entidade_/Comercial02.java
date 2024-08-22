package entidade_;

import entidade.enums.Cores;

public class Comercial02 extends ContaComercial {
	
	public double limite;

	public Comercial02(String nome, int numero, double saldo, Cores black, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}

	public String agua() {
		return toString() + "limite: " + limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
		
	
}

