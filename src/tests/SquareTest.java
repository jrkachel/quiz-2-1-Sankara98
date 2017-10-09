package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Square;

public class SquareTest {

	@Test
	public void testCalculateArea() {
		assertEquals(9,new Square(3).calculateArea(), .00001);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNegativeSquare(){
		new Square(-1);
	}
	
	@Test
	public void testCompareTo(){
		assertEquals(1,new Square(3).compareTo(new Square(1)));
	}
	
}
