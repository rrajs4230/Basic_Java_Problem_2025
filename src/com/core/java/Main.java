package com.core.java;

public class Main {

	public static void main(String[] args) {
		
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4,6);
		
		System.out.println("Area of Circle : " + circle.calculateArea());
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());

	}

}
