import static org.junit.Assert.*;

import org.junit.Test;

public class SortedSearchTest {

	@Test
	 public void NoValuesInTheArrayLessThan()
	{
		assertEquals(0, SortedSearch.CountNumbers(new int[] { 5, 6, 7, 8 }, 4));
	}

	@Test
	public void ValuesInTheArrayLessThan()
	{
		assertEquals(2, SortedSearch.CountNumbers(new int[] { 1, 3, 5, 7 }, 4));
	}

	@Test
	public void ValuesInTheLongArrayLessThan()
	{
		assertEquals(11, SortedSearch.CountNumbers(new int[] { 1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14, 16 }, 15));
	}

	@Test
	public void ValuesInTheSmallArrayLessThan()
	{
		assertEquals(2, SortedSearch.CountNumbers(new int[] { 1, 3}, 4));
	}

	@Test
	public void ReturnZeroIfEmptyListIsPassedThrough()
	{
		assertEquals(0, SortedSearch.CountNumbers(new int[] {}, 4));
	}

	@Test
	public void ValueInTheArrayLessThan()
	{
		assertEquals(1, SortedSearch.CountNumbers(new int[] { 1 }, 4));
	}

	@Test
	public void ValueNotInTheArrayLessThan()
	{
		assertEquals(0, SortedSearch.CountNumbers(new int[] { 4 }, 1));
	}

	@Test
	public void MaxValueInArrayIsLessThan()
	{
		assertEquals(9, SortedSearch.CountNumbers(new int[] { 1,2,3,4,5,6,7,8,9 }, 10));
	}

}
