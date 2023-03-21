package entities;

public abstract class Animal {

	private String name;
	
	public abstract String emitirSom();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
