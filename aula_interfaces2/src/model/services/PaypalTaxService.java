package model.services;


public class PaypalTaxService implements TaxService{


	@Override
	public double tax(double amount, int month) {
		double interest = amount *  0.01 * month;
		double fee = amount * 0.02;
		return amount + interest + fee;
	}
	
}
