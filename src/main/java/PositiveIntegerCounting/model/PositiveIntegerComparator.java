package PositiveIntegerCounting.model;

import PositiveIntegerCounting.PositiveIntegerCounting;

import java.util.Comparator;

/**
 * A comparator for positive integers. Note that this works only for positive integers. If the given positive integer
 * are not positive integers, this class will throw an IllegalArgumentException.
 *
 * @author Grayson Cox
 */
public class PositiveIntegerComparator implements Comparator<Integer> {

	private static final String EXCEPTION_NOT_A_POSITIVE_INTEGER = "Not a positive integer.";

	@Override
	public int compare(Integer positiveInteger1, Integer positiveInteger2) {
		if (positiveInteger1 <= 0 || positiveInteger2 <= 0) {
			throw new IllegalArgumentException(EXCEPTION_NOT_A_POSITIVE_INTEGER);
		}
		if (positiveInteger1 < positiveInteger2) {
			return -1;
		} else if (positiveInteger1 > positiveInteger2) {
			return 1;
		} else {
			return 0;
		}
	}

}
