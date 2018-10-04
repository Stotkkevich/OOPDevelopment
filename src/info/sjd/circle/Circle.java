package info.sjd.circle;

import java.util.logging.Logger;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {

	private static Logger logger = Logger.getLogger(Circle.class.getName());
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int)(Math.PI*radius*radius);
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(128);
		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
	}
}
