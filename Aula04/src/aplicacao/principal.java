package aplicacao;

import entidade.enums.Cores;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entidade_.Comercial02 cc = new entidade_.Comercial02 ("Millena", 22047, 6200, Cores.BLACK,200);
		
		System.out.println(cc.agua());
		
		
	}

}
