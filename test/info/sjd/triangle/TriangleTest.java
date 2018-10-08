package info.sjd.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetArea() {

		Triangle triangle = new Triangle();
		triangle.setBase(24);
		triangle.setHeight(48);
		
		assertNotNull(triangle.getArea());
		assertEquals(4000, triangle.getArea());
		assertFalse(triangle.getArea() == 2500);
	}

}
