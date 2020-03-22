package ch09Listing10;

public class CircleWithPrivateDataFields {
	private double radius;

	public CircleWithPrivateDataFields(double creationRadius) {
		this.radius = creationRadius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public void setRadius(double nextRadius) {
		this.radius = nextRadius;
	}

}
