package br.edu.univas.main;

public class StartApp {
	
	
	public static void main(String[] args) {
		CustomerController cust = new CustomerController();
		try {
			cust.createCustomer();
			
			
			
		}catch(PaymentException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
