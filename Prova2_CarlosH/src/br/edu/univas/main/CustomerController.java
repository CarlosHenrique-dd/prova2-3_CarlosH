package br.edu.univas.main;

import java.util.Scanner;

public class CustomerController {
	
	public Customer createCustomer() throws PaymentException{
		
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		
		customer.setName(sc.next());
		customer.setCpf(sc.next());
		customer.setId(sc.nextLong());
		
		String pay = sc.next();
		
		if(pay.equals("CrecitCard")) {
			customer.setPaymentMethod(new CreditCard());
		}
		else if(pay.equals("AccountDebit")) {
			customer.setPaymentMethod(new AccountDebit());
		}
		else if(pay.equals("Pix")) {
			customer.setPaymentMethod(new Pix());
		}
		else if(pay.equals("BankSlip")) {
			customer.setPaymentMethod(new BankSlip());
		}
		else {
			throw new PaymentException("pagamento nao aceito");
		}
		return customer;
	}

}
