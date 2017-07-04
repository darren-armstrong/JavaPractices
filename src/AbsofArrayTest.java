import static org.junit.Assert.*;

import org.junit.Test;

public class AbsofArrayTest {

	@Test
	public void testShouldReturnSix() {
		int A[] = {1,3,-3};
		assertEquals(6, AbsofArray.solution(A));
	}
	
	@Test
	public void testShouldReturnFour() {
		int A[] = {4,3,2,5,1,1};
		assertEquals(4, AbsofArray.solution(A));
	}
	
	@Test
	public void testShouldReturnThirtyEight() {
		int A[] = {-7,-5,-9,-20,-40,-2};
		assertEquals(38, AbsofArray.solution(A));
	}
	
	@Test
	public void testShouldReturnZero() {
		int A[] = {0};
		assertEquals(0, AbsofArray.solution(A));
	}

	@Test
	public void empytArrayShouldReturnZero() {
		int A[] = {};
		assertEquals(0, AbsofArray.solution(A));
	}
	
	@Test
	public void arrayWithSameValue() {
		int A[] = {5,5,5,5,5,5,5,5,5};
		assertEquals(0, AbsofArray.solution(A));
	}
	
	@Test
	public void arrayWithLargeNumbers() {
		int A[] = {100000,500,200,1,-100000,-50202};
		assertEquals(150202, AbsofArray.solution(A));
	}

}
