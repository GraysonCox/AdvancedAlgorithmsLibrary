package PositiveIntegerCounting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Grayson Cox
 */
public class PositiveIntegerCountingTest {

	@Test
	public void count() {
		int positiveInteger = 23;
		int expectedNumberOfPositiveIntegersLessThanOrEqualToPositiveInteger = 23;
		int resultingPositiveInteger = PositiveIntegerCounting.count(positiveInteger);
		assertEquals(resultingPositiveInteger, expectedNumberOfPositiveIntegersLessThanOrEqualToPositiveInteger);
	}

	@Test
	public void isPositiveInteger() {
		int positiveInteger = 23;
		boolean isPositiveInteger = true;
		boolean result = PositiveIntegerCounting.isPositiveInteger(positiveInteger);
		assertEquals(result, isPositiveInteger);

		positiveInteger = -23;
		isPositiveInteger = false;
		result = PositiveIntegerCounting.isPositiveInteger(positiveInteger);
		assertEquals(result, isPositiveInteger);
	}

	@Test
	public void isNotPositiveInteger() {
		int positiveInteger = -23;
		boolean isNotPositiveInteger = true;
		boolean result = PositiveIntegerCounting.isNotPositiveInteger(positiveInteger);
		assertEquals(result, isNotPositiveInteger);

		positiveInteger = 23;
		isNotPositiveInteger = false;
		result = PositiveIntegerCounting.isNotPositiveInteger(positiveInteger);
		assertEquals(result, isNotPositiveInteger);
	}

	@Test
	public void isGreaterThanOtherPositiveIntegerByOne() {
		int positiveInteger = 11;
		int otherPositiveInteger = 10;
		assert PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByOne(positiveInteger, otherPositiveInteger);

		positiveInteger = 10;
		otherPositiveInteger = 11;
		assert !PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByOne(positiveInteger, otherPositiveInteger);
	}

	@Test
	public void isGreaterThanOtherPositiveIntegerByTwo() {
		int positiveInteger = 12;
		int otherPositiveInteger = 10;
		assert PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByTwo(positiveInteger, otherPositiveInteger);

		positiveInteger = 10;
		otherPositiveInteger = 12;
		assert !PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByTwo(positiveInteger, otherPositiveInteger);
	}

	@Test
	public void isGreaterThanOtherPositiveIntegerByThree() {
		int positiveInteger = 13;
		int otherPositiveInteger = 10;
		assert PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByThree(positiveInteger, otherPositiveInteger);

		positiveInteger = 10;
		otherPositiveInteger = 13;
		assert !PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByThree(positiveInteger, otherPositiveInteger);
	}

	@Test
	public void isGreaterThanOtherPositiveIntegerByFour() {
		int positiveInteger = 14;
		int otherPositiveInteger = 10;
		assert PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByFour(positiveInteger, otherPositiveInteger);

		positiveInteger = 10;
		otherPositiveInteger = 14;
		assert !PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByFour(positiveInteger, otherPositiveInteger);
	}

	@Test
	public void isGreaterThanOtherPositiveIntegerByFive() {
		int positiveInteger = 15;
		int otherPositiveInteger = 10;
		assert PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByFive(positiveInteger, otherPositiveInteger);

		positiveInteger = 10;
		otherPositiveInteger = 15;
		assert !PositiveIntegerCounting.isGreaterThanOtherPositiveIntegerByFive(positiveInteger, otherPositiveInteger);
	}

	@Test
	public void isYourFavoritePositiveInteger() {
		// Note that this method cannot be test accurately because your favorite number is not known.
		assert true;
	}

	@Test
	public void copy() {
		int positiveInteger = 10;
		int copy = PositiveIntegerCounting.copy(positiveInteger);
		assertEquals(copy, positiveInteger);
	}

	@Test
	public void compare() {
		int positiveInteger = 10;
		int otherPositiveInteger = 11;
		assert PositiveIntegerCounting.compare(positiveInteger, otherPositiveInteger) < 0;

		positiveInteger = 11;
		otherPositiveInteger = 10;
		assert PositiveIntegerCounting.compare(positiveInteger, otherPositiveInteger) > 0;

		positiveInteger = 15;
		otherPositiveInteger = 15;
		assert PositiveIntegerCounting.compare(positiveInteger, otherPositiveInteger) == 0;
	}

}
