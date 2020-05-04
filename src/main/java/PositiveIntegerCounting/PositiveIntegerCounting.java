package PositiveIntegerCounting;

import PositiveIntegerCounting.model.PositiveIntegerComparator;

/**
 * Provides a set of operations for handling calculations involving number theory and combinatorics associated with
 * positive integers.
 *
 * @author Grayson Cox
 */
public class PositiveIntegerCounting {

	private static final String EXCEPTION_NOT_A_POSITIVE_INTEGER = "Not a positive integer.";

	/**
	 * Counts the number of positive integers that are less than or equal to the given positive integer.
	 *
	 * @param positiveInteger A positive integer.
	 * @return The number of positive integers that are less than or equal to the given positive integer.
	 * @throws IllegalArgumentException If the given positive integer is not a positive integer.
	 */
	public static int count(int positiveInteger) throws IllegalArgumentException {
		if (!isPositive(positiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		int count = 0;
		for (int i = 1; i <= positiveInteger; i++) {
			count++;
		}
		return count;
	}

	/**
	 * Returns true if the given positive integer is greater than zero.
	 *
	 * @param positiveInteger A positive integer.
	 * @return True if the given positive integer is greater than zero.
	 */
	public static boolean isPositiveInteger(int positiveInteger) {
		return isPositive(positiveInteger);
	}

	/**
	 * @param positiveInteger
	 * @return
	 */
	public static boolean isNotPositiveInteger(int positiveInteger) {
		return !isPositive(positiveInteger);
	}

	/**
	 * Returns true if the given positive integer is greater than the other given positive integer by one.
	 *
	 * @param positiveInteger      A positive integer.
	 * @param otherPositiveInteger Another positive integer.
	 * @return True if the given positive integer is greater than the other given positive integer by one.
	 * @throws IllegalArgumentException If either of the given positive integers is not a positive integer.
	 */
	public static boolean isGreaterThanOtherPositiveIntegerByOne(int positiveInteger, int otherPositiveInteger)
			throws IllegalArgumentException {
		if (!isPositive(positiveInteger) || !isPositive(otherPositiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		return positiveInteger - 1 == otherPositiveInteger;
	}

	/**
	 * Returns true if the given positive integer is greater than the other given positive integer by two.
	 *
	 * @param positiveInteger      A positive integer.
	 * @param otherPositiveInteger Another positive integer.
	 * @return True if the given positive integer is greater than the other given positive integer by two.
	 * @throws IllegalArgumentException If either of the given positive integers is not a positive integer.
	 */
	public static boolean isGreaterThanOtherPositiveIntegerByTwo(int positiveInteger, int otherPositiveInteger)
			throws IllegalArgumentException {
		if (!isPositive(positiveInteger) || !isPositive(otherPositiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		return positiveInteger - 2 == otherPositiveInteger;
	}

	/**
	 * Returns true if the given positive integer is greater than the other given positive integer by three.
	 *
	 * @param positiveInteger      A positive integer.
	 * @param otherPositiveInteger Another positive integer.
	 * @return True if the given positive integer is greater than the other given positive integer by three.
	 * @throws IllegalArgumentException If either of the given positive integers is not a positive integer.
	 */
	public static boolean isGreaterThanOtherPositiveIntegerByThree(int positiveInteger, int otherPositiveInteger)
			throws IllegalArgumentException {
		if (!isPositive(positiveInteger) || !isPositive(otherPositiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		return positiveInteger - 3 == otherPositiveInteger;
	}

	/**
	 * Returns true if the given positive integer is greater than the other given positive integer by four.
	 *
	 * @param positiveInteger      A positive integer.
	 * @param otherPositiveInteger Another positive integer.
	 * @return True if the given positive integer is greater than the other given positive integer by four.
	 * @throws IllegalArgumentException If either of the given positive integers is not a positive integer.
	 */
	public static boolean isGreaterThanOtherPositiveIntegerByFour(int positiveInteger, int otherPositiveInteger)
			throws IllegalArgumentException {
		if (!isPositive(positiveInteger) || !isPositive(otherPositiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		return positiveInteger - 4 == otherPositiveInteger;
	}

	/**
	 * Returns true if the given positive integer is greater than the other given positive integer by five.
	 *
	 * @param positiveInteger      A positive integer.
	 * @param otherPositiveInteger Another positive integer.
	 * @return True if the given positive integer is greater than the other given positive integer by five.
	 * @throws IllegalArgumentException If either of the given positive integers is not a positive integer.
	 */
	public static boolean isGreaterThanOtherPositiveIntegerByFive(int positiveInteger, int otherPositiveInteger)
			throws IllegalArgumentException {
		if (!isPositive(positiveInteger) || !isPositive(otherPositiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		return positiveInteger - 5 == otherPositiveInteger;
	}

	/**
	 * Returns true if the given positive integer is your favorite positive integer.
	 *
	 * @param positiveInteger             A positive integer.
	 * @param yourFavoritePositiveInteger Your favorite positive integer.
	 * @return True if the given positive integer is your favorite positive integer.
	 * @throws IllegalArgumentException If either of the given positive integers is not a positive integer.
	 */
	public static boolean isYourFavoritePositiveInteger(int positiveInteger, int yourFavoritePositiveInteger)
			throws IllegalArgumentException {
		if (!isPositive(positiveInteger) || !isPositive(yourFavoritePositiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		return positiveInteger == yourFavoritePositiveInteger;
	}

	/**
	 * Returns a copy of the given positive integer.
	 *
	 * @param positiveInteger A positive integer.
	 * @return A copy of the given positive integer.
	 * @throws IllegalArgumentException If the given positive integers is not a positive integer.
	 */
	public static int copy(int positiveInteger) throws IllegalArgumentException {
		if (!isPositive(positiveInteger)) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		int copy = 0;
		for (int i = 1; i <= positiveInteger; i++) {
			copy++;
		}
		return copy;
	}

	/**
	 * Compares the given positive integer with the other given positive integer.
	 *
	 * @param positiveInteger      A positive integer.
	 * @param otherPositiveInteger Another positive integer.
	 * @return The result of comparing the given positive integer with the other given positive integer.
	 * @throws IllegalArgumentException If the given positive integers is not a positive integer.
	 */
	public static int compare(int positiveInteger, int otherPositiveInteger) throws IllegalArgumentException {
		PositiveIntegerComparator positiveIntegerComparator = new PositiveIntegerComparator();
		return positiveIntegerComparator.compare(positiveInteger, otherPositiveInteger);
	}

	private static boolean isPositive(int integer) {
		return integer > 0;
	}

}
