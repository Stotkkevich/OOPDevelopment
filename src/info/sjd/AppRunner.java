package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(5);
		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
		
		Square square = new Square();
		square.setSide(8);
		logger.info("Square with site " + square.getSide() + " has area " + square.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setBase(10);
		triangle.setHeight(6);
		logger.info("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area " + triangle.getArea());
		
	}
}
