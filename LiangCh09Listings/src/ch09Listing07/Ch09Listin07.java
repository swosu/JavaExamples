package ch09Listing07;

public class Ch09Listin07 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " +
				CircleWithStaticMembers.getNumberOfObjects());

		// Create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();

		// Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		
		System.out.println("c1: radius (" + c1.getRadius() +
				") and number of Circle objects (" +
				CircleWithStaticMembers.getNumberOfObjects() + ")");

		// Create c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

		// Modify c1
		c1.setRadius(9);

		// Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		
		System.out.println("c1: radius (" + c1.getRadius() +
				") and number of Circle objects (" +
				CircleWithStaticMembers.getNumberOfObjects() + ")");
		
		System.out.println("c2: radius (" + c2.getRadius() +
				") and number of Circle objects (" +
				CircleWithStaticMembers.getNumberOfObjects() + ")");

		c2.setRadius(10);
		System.out.printf("Circle with radius %.2f has area %.3f\n", c2.getRadius(), c2.getArea());

		System.out.println("Bye.");

	}

}
