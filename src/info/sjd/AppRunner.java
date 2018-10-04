package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		Square square = new Square();
		square.setSide(24);
		logger.info("Square with site " + square.getSide() + " has area " + square.getArea());
		
		Circle circle = new Circle();
		circle.setRadius(48);
		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setBase(64);
		triangle.setHeight(128);
		logger.info("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area " + triangle.getArea());
		
	}
}
