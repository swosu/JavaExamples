package ch09Listing10;

public class Ch09Listing10 {

	public static void main(String[] args) {
		System.out.println("Hello.");

		// Create a Circle object with radius 1
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(1);

		// Print areas for radius 1, 2, 3, 4, and 5.
		int n = 5;
		printAreas(myCircle, n);
		
		// See myCircle.radius and times
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);


		System.out.println("Bye.");

	}

	private static void printAreas(CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius \t\tArea");
		while (times >= 1) 
		{
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}

	}

}
