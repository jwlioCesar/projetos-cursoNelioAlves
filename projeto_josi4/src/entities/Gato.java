package entities;

public class Gato extends Animal{

	public Gato(String nome, String especie) {
		super(nome, especie);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String emitirSom() {
		
		return "miau";
	}

	@Override
	public String brincar() {
		return "gato brincando";
	}

}
