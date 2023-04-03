package entities;

public class Rectangle implements Shape {

	private Double base;
	private Double altura;

	public Rectangle(Double base, Double altura) {
		super();
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

	@Override
	public Double area() {
		return base * altura;
	}

}
