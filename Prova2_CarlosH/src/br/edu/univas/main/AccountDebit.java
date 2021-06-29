package br.edu.univas.main;

public class AccountDebit implements PaymentMethod{
	
	@Override
	public String data() {
		return "AccountDebit";
	}

}
