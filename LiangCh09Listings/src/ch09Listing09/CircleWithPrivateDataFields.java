package ch09Listing09;

public class CircleWithPrivateDataFields {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithPrivateDataFields() {
		numberOfObjects++;
	}

	public CircleWithPrivateDataFields(double creationRadius) {
		numberOfObjects++;
		this.radius = creationRadius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public void setRadius(double nextRadius) {
		if(nextRadius >= 0)
		{
			this.radius = nextRadius;
		}
		else
		{
			System.out.println("Negative radius not allowed.");
			System.out.printf("Radius is %.2f\n", this.radius );
		}
		
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

}
