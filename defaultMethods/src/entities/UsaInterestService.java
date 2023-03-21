package entities;

public class UsaInterestService implements InterestService{

	private Double interestRate = 1.0;

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}
