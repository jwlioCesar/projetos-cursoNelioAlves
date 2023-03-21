package entities;

public class Caculadora {

	private Double x;
	private char y;
	private Double z;

	public Caculadora(Double x, char y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public char getY() {
		return y;
	}
	public void setY(char y) {
		this.y = y;
	}
	public Double getZ() {
		return z;
	}
	public void setZ(Double z) {
		this.z = z;
	}

	public String calcular() {

		if (y == 'x') {
			return String.format("%.2f", x * z);
		} else if (y == '/') {
			return String.format("%.2f", x / z);
		} else if (y == '+') {
			return String.format("%.2f", x + z);
		} else if (y == '-') {
			return String.format("%.2f", x - z);
		}
		return "operação desconhecida";
	}

}
