package entities;

public class Banco {

	private Double saldo;

	public Banco(Double saldo) {
		super();
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(double amount) throws Exception {
		if (saldo < 0.1) {
			throw new Exception("error: você não tem saldo");
		}
		if (amount > saldo) {
			throw new Exception("error: pedido saque maior que o saldo");
		}
		saldo -= amount;
	}

	public void deposito(double amount) {
		saldo += amount;
	}
}
