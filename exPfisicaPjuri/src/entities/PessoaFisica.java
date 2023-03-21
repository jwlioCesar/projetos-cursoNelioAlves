package entities;

public class PessoaFisica extends Pessoa{

	private Double healtExpenditures;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String name, Double anualIncome, Double healtExpenditures) {
		super(name, anualIncome);
		this.healtExpenditures = healtExpenditures;
	}

	
	
	public Double getHealtExpenditures() {
		return healtExpenditures;
	}

	public void setHealtExpenditures(Double healtExpenditures) {
		this.healtExpenditures = healtExpenditures;
	}

	@Override
	public Double taxes() {
		if (getAnualIncome()<20000.00) {
			return 0.15*getAnualIncome()-healtExpenditures/2;
		}else {
			return 0.25*getAnualIncome()-healtExpenditures/2;
		}
	}


}
