package info.sjd.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testGetArea() {

		Circle circle = new Circle();
		circle.setRadius(5);
		
		assertNotNull(circle.getArea());
		assertEquals(78, circle.getArea());
		assertFalse(circle.getArea() == 86);
	}

}
