package ch09Listing01;

public class Ch09Listing01 {

	public static void main(String[] args) {
		// Create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();

		System.out.println("The area of the circle of radius "
				+ circle1.getRadius() + " is " + circle1.getArea());

		// Create a circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius "
				+ circle2.getRadius() + " is " + circle2.getArea());

		// Create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius "
				+ circle3.getRadius() + " is " + circle3.getArea());

		// Modify circle radius
		circle2.setRadius(100); // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius "
				+ circle2.getRadius() + " is " + circle2.getArea());
		
		circle1.setRadius(0.5);
		System.out.println("The perimeter of the circle of radius "
				+ circle1.getRadius() + " is " + circle1.getPerimeter());
	}
}