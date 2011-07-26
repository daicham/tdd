import static org.junit.Assert.*;

import org.junit.Test;


public class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
	
	@Test
	public void testEquality() throws Exception {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
