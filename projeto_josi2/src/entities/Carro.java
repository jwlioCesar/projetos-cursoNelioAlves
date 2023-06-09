package entities;

public class Carro {

	private String marca;
	private String modelo;
	private Integer ano;
	
	public Carro(String marca, String modelo, Integer ano) {
		super();this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getInformacoes() {
	
		return "Marca: " + marca 
				+ "\nModelo: " + modelo
				+ "\nAno: " + ano;
	}

}
