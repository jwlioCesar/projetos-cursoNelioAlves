package entities;

public class Cachorro extends Animal{

	public Cachorro(String nome, String especie) {
		super(nome, especie);
	}

	@Override
	public String emitirSom() {
	return "auau";
	}

	@Override
	public String brincar() {
	return "cachorro brincando";
	}

}
