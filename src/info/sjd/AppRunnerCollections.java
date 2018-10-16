package info.sjd;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class AppRunnerCollections {

	private static Logger logger = Logger.getLogger(AppRunnerCollections.class.getName());
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(5);
				
		Square square = new Square();
		square.setSide(8);
		
		Triangle triangle = new Triangle();
		triangle.setBase(10);
		triangle.setHeight(6);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(triangle);
		shapes.add(square);
		shapes.add(circle);
		
		Shape maxShape = null;
		Shape minShape = null;
		
		if (!shapes.isEmpty()) {
			maxShape = shapes.get(0);
			minShape = shapes.get(0);
		}
		
		for (Shape collections : shapes) {
			if (maxShape.getArea() < collections.getArea()) {
				maxShape = collections;
			} 
		}
				
		for (int i=0; i< shapes.size(); i++) {
			
			if (maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}
			
			if (i!= 0 && minShape.getArea() > shapes.get(i).getArea()) {
				minShape = shapes.get(i);
			}
		}
		
		logger.info("Shape " + maxShape.getClass().getSimpleName() + " has maximal area " + 
		maxShape.getArea());
		
		logger.info("Shape " + minShape.getClass().getSimpleName() + " has minimal area " + 
				minShape.getArea());
		
	}
}
