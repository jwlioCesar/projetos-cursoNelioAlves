package entities;

public class Carro {

	private String model;
	private String year;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public void ligarMarcha() {
		System.out.println("Marcha ligada");
	}
	
	public void desligarMarcha() {
		System.out.println("Marcha desligada");
	}
	
	public void ligarCarro() {
		System.out.println("Carro ligado");
	}
	public void desligarCarro() {
		System.out.println("Carro desligado");
	}
	
}
