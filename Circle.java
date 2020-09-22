package com.gmail.asf;

public class Circle extends Shape {
	Point a = new Point(0.0, 0.0);
	Point b = new Point(3.0, 0.0);
	double r = Math.sqrt((b.getX() - a.getX())*(b.getX() - a.getX()))+((b.getY()-a.getY())*(b.getY()-a.getY()));

	@Override
	double getPerimetr() {
		return 2*Math.PI*r;
	}

	@Override
	double getArea() {
		return Math.PI*Math.pow(r, 2);
	}

	@Override
	public String toString() {
		return "Circle [Perimetr = " + getPerimetr() + ", Area = " + getArea() + "]";
	}
	
}
