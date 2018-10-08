package info.sjd.square;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testGetArea() {
		
		Square square = new Square();
		square.setSide(24);
		
		assertNotNull(square.getArea());
		assertEquals(7500, square.getArea());
		assertTrue(square.getArea() == 8500);
	}
}
