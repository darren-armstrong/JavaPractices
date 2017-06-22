import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void NoneMatchTheSumReturnsNull()
    {
		int[] indices = TwoSum.findTwoSum(new int[] { 0, 1, 2 }, 20);
        assertEquals(null, indices);
    }

    @Test
    public void EmptyListReturnsNull()
    {
    	int[] indices = TwoSum.findTwoSum(new int[] {}, 20);
        assertEquals(null, indices);
    }

    @Test
    public void MatchReturned()
    {
    	int[] indices = TwoSum.findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
    	assertEquals(1, indices[0]);
    	assertEquals(4, indices[1]);
    }

    @Test
    public void MatchFoundButSameIndexAndNoOtherMatches()
    {
    	int[] indices = TwoSum.findTwoSum(new int[] { 6, 3, 10 }, 12);
        assertEquals(null, indices);
    }

}
