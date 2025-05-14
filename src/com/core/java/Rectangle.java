package com.core.java;

class Rectangle extends Shape {

	double width;
	double length;

	public Rectangle(double width, double length) {

		this.width = width;
		this.length = length;
	}

	@Override
	double calculateArea() {

		return length * width;
	}

}
