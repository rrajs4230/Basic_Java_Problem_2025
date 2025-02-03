package com.core.java;

class Circle extends Graphic_Object {
  
	double radius;
	
	
	Circle(int x, int y, String lineColor, String fillColor) {
		super(x, y, lineColor, fillColor);
		
	}

	@Override
	void draw() {
		
		System.out.println("Drawing a Circle at (" + x + ", " + y + 
	            ") with radius " + radius + ", line color: " + lineColor + 
	            ", fill color: " + fillColor);

	}

	@Override
	void resize() {
		
		System.out.println("resize the circle");
		
	}

}
