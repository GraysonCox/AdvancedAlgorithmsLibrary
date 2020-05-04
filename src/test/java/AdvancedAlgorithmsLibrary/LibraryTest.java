package AdvancedAlgorithmsLibrary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Grayson Cox
 */
public class LibraryTest {

	@Test
	public void testSomeLibraryMethod() {
		Library classUnderTest = new Library();
		assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
	}

}
