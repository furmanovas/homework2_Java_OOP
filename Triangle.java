package com.gmail.asf;

public class Triangle extends Shape {
	Point a = new Point(1.0, 5.0);
	Point b = new Point(6.0, 3.0);
	Point c = new Point(4.0, 2.0);
	double ab = Math.sqrt((b.getX() - a.getX())*(b.getX() - a.getX())+(b.getY()-a.getY())*(b.getY()-a.getY()));
	double ac = Math.sqrt((c.getX() - a.getX())*(c.getX() - a.getX())+(c.getY()-a.getY())*(c.getY()-a.getY()));
	double bc = Math.sqrt((c.getX() - b.getX())*(c.getX() - b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
	
	@Override
	double getPerimetr() {
		return ab+ac+bc;
	}

	@Override
	double getArea() {
		double polP=(ab+ac+bc)/2;
		return Math.sqrt(polP*(polP-ab)*(polP-ac)*(polP-bc));
	}

	@Override
	public String toString() {
		return "Triangle [Perimetr = " + getPerimetr() + ", Area = " + getArea() + "]";
	}
	
	

}
