package info.sjd.square;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testGetArea() {
		
		Square square = new Square();
		square.setSide(8);
		
		assertNotNull(square.getArea());
		assertEquals(64, square.getArea());
	}
}
