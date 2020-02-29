package jtm.activity11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

import static org.junit.Assert.*;

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
		int insertA = sc.add(10, 0);
		Assert.assertEquals("Given value should be in range [-10,10]", 10, insertA);

		int insertB = sc.add(5, -10);
		Assert.assertEquals("Given value should be in range [-10,10]", -5, insertB);

		int result = sc.add (-4, -5);
		Assert.assertEquals("Result should be in range [-10,10]", -9, result);
	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
		Integer insertA = sc.add(-11, 0);
		Assert.assertNull("Given value should be in range [-10,10]", insertA);

		Integer insertB = sc.add(0, -15);
		Assert.assertNull("Given value should be in range [-10,10]", insertB);

		Integer resultA = sc.add (-6, -5);
		Assert.assertNull("Result should be in range [-10,10]", resultA);

		Integer resultB = sc.add (6, 5);
		Assert.assertNull("Result should be in range [-10,10]", resultB);

	}

	@Test
	public void testSubtractInRange() {
		// TODO
		int insertA = sc.subtract(10, 0);
		Assert.assertEquals("Given value should be in range [-10,10]", 10, insertA);

		int insertB = sc.subtract(5, 10);
		Assert.assertEquals("Given value should be in range [-10,10]", -5, insertB);

		int result = sc.subtract (4, -5);
		Assert.assertEquals("Result should be in range [-10,10]", 9, result);
	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO
		Integer insertA = sc.subtract(-11, 0);
		Assert.assertNull("Given value should be in range [-10,10]", insertA);

		Integer insertB = sc.subtract(5, -15);
		Assert.assertNull("Given value should be in range [-10,10]", insertB);

		Integer resultA = sc.subtract (-6, 5);
		Assert.assertNull("Result should be in range [-10,10]", resultA);

		Integer resultB = sc.subtract (10, -10);
		Assert.assertNull("Result should be in range [-10,10]", resultB);

	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		int insertA = sc.multiply(10, 0);
		Assert.assertEquals("Given value should be in range [-10,10]", 0, insertA);

		int insertB = sc.multiply(2, 3);
		Assert.assertEquals("Given value should be in range [-10,10]", 6, insertB);

		int result = sc.multiply (-4, -2);
		Assert.assertEquals("Result should be in range [-10,10]", 8, result);
	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
		Integer insertA = sc.multiply(-11, 0);
		Assert.assertNull("Given value should be in range [-10,10]", insertA);

		Integer insertB = sc.multiply(5, -15);
		Assert.assertNull("Given value should be in range [-10,10]", insertB);

		Integer resultA = sc.multiply (-6, 5);
		Assert.assertNull("Result should be in range [-10,10]", resultA);

		Integer resultB = sc.multiply (10, -10);
		Assert.assertNull("Result should be in range [-10,10]", resultB);
	}

	@Test
	public void testDivideInRange() {
		// TODO
		int insertA = sc.divide(0, 10);
		Assert.assertEquals("Given value should be in range [-10,10]", 0, insertA);

		int insertB = sc.divide(6, -3);
		Assert.assertEquals("Given value should be in range [-10,10]", -2, insertB);

		int result = sc.divide (-4, -2);
		Assert.assertEquals("Result should be in range [-10,10]", 2, result);
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
		Integer insertA = sc.divide(0, -15);
		Assert.assertNull("Given value should be in range [-10,10]", insertA);

		Integer insertB = sc.divide(5, -15);
		Assert.assertNull("Given value should be in range [-10,10]", insertB);

		Integer resultA = sc.divide (-100, 4);
		Assert.assertNull("Result should be in range [-10,10]", resultA);


	}

}
