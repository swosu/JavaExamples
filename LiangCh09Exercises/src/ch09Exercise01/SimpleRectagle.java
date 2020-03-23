package ch09Exercise01;

public class SimpleRectagle {
	private double width;
	private double height;
	
	public SimpleRectagle() {
		this.width = 1.0;
		this.height = 1.0;
		
	}

	public SimpleRectagle(double creationWidth, double creationHeight) {
		this.width = creationWidth;
		this.height = creationHeight;
	}

	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return 2 * this.width + 2 * this.height;
	}

}
