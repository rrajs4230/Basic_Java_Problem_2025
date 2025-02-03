package com.core.java;

public abstract class Graphic_Object {

	protected int x;
	protected int y;
	protected String lineColor;
	protected String fillColor;
	Graphic_Object(int x, int y, String lineColor, String fillColor) {
		
		this.x = x;
		this.y = y;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	void moveTo(int x, int y) {
		
		this.x=x;
		this.y=y;
		System.out.println("Moved to new position: (" + x + ", " + y + ")");
	}
	
	abstract void draw();
	abstract void resize();
	
}
