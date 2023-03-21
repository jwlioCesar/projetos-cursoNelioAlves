package entities;

public class Cachorro extends Mamifero implements IAnimalDomesticado, IAnimalAEstimacao{

	private String tamanho;
	private String raça;
	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVet() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chamarVet() {
		// TODO Auto-generated method stub
		
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}

	
	
}
