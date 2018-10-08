package info.sjd.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testGetArea() {

		Circle circle = new Circle();
		circle.setRadius(128);
		
		assertNotNull(circle.getArea());
		assertEquals(1234, circle.getArea());
		assertTrue(circle.getArea() == 600);
		assertFalse(circle.getArea() == 4890);
	}

}
