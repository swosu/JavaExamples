package ch09Listing07;

public class CircleWithStaticMembers {
	private static int numberOfObjects = 0;
	private double radius;
	
	public CircleWithStaticMembers () {
		numberOfObjects++;
		this.setRadius(1.0);
	}
	
	public CircleWithStaticMembers(double creationRadius) {
		numberOfObjects++;
		this.setRadius(creationRadius);
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double nextRadius) {
		this.radius = nextRadius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

}
