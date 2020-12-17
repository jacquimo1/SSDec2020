package problem4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class LineTest {
	
	@Test
	public void getSlopeThrowsExceptionIfDivindingByZero() {
		assertThrows(ArithmeticException.class, () -> {
			Line testLine = new Line(1.0, 1.0, 1.0, 1.0);
			testLine.getSlope();
		});
	}	
	
	@Test
	public void getSlopeTest() {
		Line testLine = new Line(2.0, 4.0, 1.0, 2.0);
		assertTrue(testLine.getSlope() == 2.0);
	}
	
	@Test
	public void getDistanceTest() {
		Line testLine = new Line(1.0, 2.0, 1.0, 2.0);
		assertEquals(testLine.getDistance(), 0.0, 0);
		
	}
}
