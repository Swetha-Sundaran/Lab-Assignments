package day_4;

import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
		
		Circle circle = new Circle("Circle",0);
		Square square = new Square("Square",0);
		Rectangle rectangle = new Rectangle("Rectangle",0,0);
		
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.printf("Circle\nSquare\nRectangle\n");
		System.out.println("Enter the shape name..");
		name = scan.nextLine();
		if(name.equals(circle.getName())) {
			int radius;
			System.out.println("Enter radius...");
			radius = scan.nextInt();
			circle.setRadius(radius);
			System.out.println("Area of the circle..."+circle.calculateArea());
		}
		else if(name.equals(square.getName())) {
			int radius;
			System.out.println("Enter Side value...");
			radius = scan.nextInt();
			square.setRadius(radius);
			System.out.println("Area of the square..."+square.calculateArea());
		}
		else if(name.equals(rectangle.getName())) {
			float length;
			float breath;
			System.out.println("Enter length...");
			length = scan.nextInt();
			rectangle.setLength(length);
			System.out.println("Enter breath...");
			breath = scan.nextInt();
			rectangle.setBreath(breath);
			System.out.println("Area of the rectangle..."+rectangle.calculateArea());
		}
		
	}

}
