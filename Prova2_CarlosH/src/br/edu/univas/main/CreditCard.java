package br.edu.univas.main;

public class CreditCard implements PaymentMethod{
	
	@Override
	public String data() {
		return "CreditCard";
	}

}
