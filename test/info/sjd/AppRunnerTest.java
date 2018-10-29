package info.sjd;

import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.circle.Circle;
import info.sjd.square.Square;
import info.sjd.triangle.Triangle;

public class AppRunnerTest {

	@Test
	public void testGetArea() {
		
		//Circle
		Circle circle = new Circle();
		circle.setRadius(5);
		
		assertNotNull(circle.getArea());
		assertFalse(circle.getArea() >= 86);

		//Square
		Square square = new Square();
		square.setSide(8);
		
		assertNotNull(square.getArea());
		assertEquals(64, square.getArea());

		//Triangle
		Triangle triangle = new Triangle();
		triangle.setBase(10);
		triangle.setHeight(6);
		
		assertNotNull(triangle.getArea());
		assertTrue(triangle.getArea() >= 25);
	}

}
