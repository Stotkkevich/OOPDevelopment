package info.sjd.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetArea() {

		Triangle triangle = new Triangle();
		triangle.setBase(10);
		triangle.setHeight(6);
		
		assertNotNull(triangle.getArea());
		assertEquals(30, triangle.getArea());
		assertTrue(triangle.getArea() >= 25);
	}

}
