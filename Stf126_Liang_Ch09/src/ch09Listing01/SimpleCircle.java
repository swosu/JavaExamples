package ch09Listing01;

public class SimpleCircle {

	private double radius;
	
	SimpleCircle(double birthRadius){
		this.setRadius(birthRadius);
	}

	public SimpleCircle() {
		this.setRadius(1.0);
	}

	public double getArea() {
		double area = Math.PI * this.getRadius() *this.getRadius();
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return (2 * this.radius * Math.PI);
	}

}
