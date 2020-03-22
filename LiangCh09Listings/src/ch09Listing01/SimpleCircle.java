package ch09Listing01;

public class SimpleCircle {
	
	private double radius;

	public SimpleCircle() {
		this.setRadius(1.0);
	}

	public SimpleCircle(double creationRadius) {
		this.setRadius(creationRadius);
	}

	public double getArea() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}

	public void setRadius(double updatedRadius) {
		this.radius = updatedRadius;
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}
}
