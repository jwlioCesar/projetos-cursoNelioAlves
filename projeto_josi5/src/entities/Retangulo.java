package entities;

import exceptions.DimensaoInvalidaException;

public class Retangulo {

	private Double base;
	private Double altura;
	public Retangulo(Double base, Double altura) throws DimensaoInvalidaException {
		if (base <0 || altura < 0) {
			throw new DimensaoInvalidaException("error: dimensão inválida");
		}
		this.base = base;
		this.altura = altura;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double calcularArea() {
		
		return base * altura;
	}
}
