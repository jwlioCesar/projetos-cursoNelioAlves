package model.services;

import model.entities.Contract;

public class Parcelas {

	private Integer numeroDeParcelas;

	private Contract contract;

	private TaxService taxService;

	public Parcelas(Integer numeroDeParcelas, Contract contract, TaxService tax) {
	
		this.numeroDeParcelas = numeroDeParcelas;
		this.contract = contract;
		this.taxService = tax;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public TaxService getTax() {
		return taxService;
	}

	public void setTax(TaxService tax) {
		this.taxService = tax;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public void processoDeParcelas(Contract contract) {

		double parcela = contract.getContractValue() / numeroDeParcelas;
		for (int i = 1; i<=numeroDeParcelas; i++) {
			System.out.println(contract.getDate().plusMonths(i) + " - " + taxService.tax(parcela, i));
		}
	}

}
