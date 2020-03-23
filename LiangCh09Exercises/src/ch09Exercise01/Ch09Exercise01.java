package ch09Exercise01;

public class Ch09Exercise01 {

	public static void main(String[] args) {
		System.out.println("Hello.");
		
		/** 9.1 (The Rectangle class)*/ 
		/* Following the example of the Circle class in Section 9.2,
		 * design a class named Rectangle to represent a rectangle. The class contains:
		 * 
		 * Two double data fields named width and height that specify the width and
		 * height of the rectangle. The default values are 1 for both width and height .
		 * 
		 * A no-arg constructor that creates a default rectangle.
		 * 
		 * A constructor that creates a rectangle with the specified width and height .
		 * 
		 * A method named getArea() that returns the area of this rectangle.
		 * 
		 * A method named getPerimeter() that returns the perimeter.
		 * 
		 * Draw the UML diagram for the class and then implement the class. 
		 * 
		 * Write a test program that creates two Rectangle objects—one with 
		 * width 4 and height 40 and the other with width 3.5 and height 35.9 . 
		 * Display the width, height, area,
		 * and perimeter of each rectangle in this order.
		 */
		
		SimpleRectagle rectange1 = new SimpleRectagle();
		SimpleRectagle rectange2 = new SimpleRectagle(4.0,40);
		SimpleRectagle rectange3 = new SimpleRectagle(3.5,35.9);
		
		System.out.printf("a rectangle with a width %.2f and height %.2f has a area of %.2f and a perimeter of %.2f\n",
				rectange2.getWidth(), rectange2.getHeight(), rectange2.getArea(), rectange2.getPerimeter());
		
		System.out.printf("a rectangle with a width %.2f and height %.2f has a area of %.2f and a perimeter of %.2f\n",
				rectange3.getWidth(), rectange3.getHeight(), rectange3.getArea(), rectange3.getPerimeter());
		
		System.out.println("Bye.");

	}

}
