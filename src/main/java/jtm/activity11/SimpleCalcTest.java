package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		sc = new SimpleCalc();
	}

	@Test
	public void testAddInRange() {
		// TODO test addition for case where both numbers and result is in allowed range
		int result = sc.add(5, 6);
//		Assert.assertEquals("Given values should be in range [-10,10]", [-10,10], result)
	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
	}

	@Test
	public void testSubtractInRange() {
		// TODO
	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO
	}

	@Test
	public void testMultiplyInRange() {
		// TODO
	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
	}

	@Test
	public void testDivideInRange() {
		// TODO
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
	}

}
