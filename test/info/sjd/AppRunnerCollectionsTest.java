package info.sjd;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppRunnerCollectionsTest {
	
	public Shape maxShape;
	public Shape minShape;

	@Test
	public void testMain() {
		
		assertNotNull(maxShape.getArea());
		assertNotNull(minShape.getArea());
		assertTrue(maxShape.getArea() >= 80);
		assertFalse(minShape.getArea() <= 32);

	}

}
