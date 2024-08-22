package aplicacao;

import java.util.Scanner;
import entidade.enums.Cores;
import entidade_.ContaComercial;
import entidade_.ContaCorrente;
import entidade_.Conta_Pouupanca;

public class Aplicacao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);

    System.out.print("Bem vindo ao Banco do Brasil! \n \n ");
    
    System.out.print("Conta Corrente = 1   Conta poupança = 2   Conta Comercial = 3");
    System.out.print("\n Acesse uma conta: ");
    int x = scn.nextInt();
    
    
    if (x == 1) {
    	
    	System.out.print("Digite o nome da conta: ");
    	String nomeContaCorrente = scn.next();
    	System.out.print("DIgite o saldo");
    	double saldo = scn.nextDouble();
    	System.out.println("\nDigite o numero da conta:");
    	int numeroContaCorrente = scn.nextInt();
    	ContaCorrente a = new ContaCorrente(nomeContaCorrente,saldo,numeroContaCorrente);
    	System.out.print(a);
    	
    	
    }
    else if(x == 2) {
    	
    	System.out.print("Digite o nome da conta: ");
    	String nomepoupanca = scn.next();
    	System.out.print("DIgite o saldo");
    	double saldo = scn.nextDouble();
    	System.out.println("\nDigite o numero da conta:");
    	int numeropoupanca = scn.nextInt();
    	ContaPouupanca a = new ContaPouupanca(nomepoupanca,saldo,numeropoupanca);
    	System.out.print(a);
    }
    else if (x ==3) {
    	System.out.print("Digite o nome da conta: ");
    	String nomeContaComercial = scn.next();
    	System.out.print("Digite o saldo: ");
    	double saldo = scn.nextDouble();
    	System.out.println("\nDigite o numero da conta:");
    	int numeroContaComercial = scn.nextInt();
    	System.out.println("Digite o limite: ");
    	double limite = scn.nextDouble();
    	ContaComercial a = new ContaComercial(nomeContaComercial,saldo,numeroContaComercial, limite);
    	System.out.print(a)
    	
    }
    
    scn.close();
	}

}
