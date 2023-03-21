package entities;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	
	 default Double payment(double amount, double months) {
		if (months < 1) {
			throw new InvalidParameterException("months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
