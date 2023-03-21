package entities;

import entities.enums.Color;

public abstract class abstractShape implements Shape {

	private Color color;

	public abstractShape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
