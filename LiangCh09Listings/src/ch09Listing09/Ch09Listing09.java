package ch09Listing09;

public class Ch09Listing09 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(5.0);
		
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
		+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(-5);
		
		System.out.println("The number of objects created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects());
		
		CircleWithPrivateDataFields myCircle2 =
				new CircleWithPrivateDataFields(5.0);
		
		System.out.println("The number of objects created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects());
		
		System.out.println("Bye.");

	}

}