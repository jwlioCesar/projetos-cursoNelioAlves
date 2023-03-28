package entities;

public class Gato extends Animal{

	public Gato(String nome, String especie) {
		super(nome, especie);
	}

	@Override
	public String emitirSom() {	
		return "miau";
	}

}
