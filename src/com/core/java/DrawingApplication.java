package com.core.java;

public class DrawingApplication {

	public static void main(String[] args) {
		
		Graphic_Object circle = new Circle(6, 5, "black", "Green");
		
		circle.moveTo(5, 1);
		circle.draw();
	}
	
	

}
