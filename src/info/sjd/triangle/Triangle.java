package info.sjd.triangle;

import java.util.logging.Logger;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private static Logger logger = Logger.getLogger(Triangle.class.getName());
	
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getArea() {
		return (int)(height*base/2);
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.setBase(24);
		triangle.setHeight(48);
		logger.info("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area " + triangle.getArea());
	}
}
