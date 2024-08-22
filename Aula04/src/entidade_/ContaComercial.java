package entidade_;

import entidade.enums.Cores;

public class ContaComercial {
   
	private String nome;
	private int numero;
	private double saldo;
    private Cores cor;
	
	public ContaComercial(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
    public ContaComercial() {
		// TODO Auto-generated constructor stub
	}

	public void sacar(double saque) {
    	saldo = saldo - saque;
    }
    public void depositar(double deposito) {
    	saldo = saldo + deposito;
    			
    			
    }
	public String getNome() {
		return nome;
	}


	public void setNome6 (String nome) {
		this.nome = nome;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public String toString() {
		return "ContaComercial [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + ", cor " + cor + "]";
	}

	
	
}
