import static org.junit.Assert.*;

import org.junit.Test;

public class EquilibriumIndexTest {
	
	@Test
	public void returnThree() {
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		assertEquals(3, EquilibriumIndex.solution(arr));
	}
	
	@Test
	public void returnIndex() {
		int arr[] = {-1, 3, -4, 5, 1, -6, 2, 1};
		assertEquals(1, EquilibriumIndex.solution(arr));
	}
	
	@Test
	public void emptyArray() {
		int arr[] = {};
		assertEquals(-1, EquilibriumIndex.solution(arr));
	}
	
	@Test
	public void arrayWithOneIndex() {
		int arr[] = {1};
		assertEquals(0, EquilibriumIndex.solution(arr));
	}
}
