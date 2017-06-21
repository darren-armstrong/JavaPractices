import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromTest {

	@Test
	public void InsertAPalindromeWithUppercase() {
		assertEquals(true, Palindrome.IsPalindrome("Deleveled"));
	}

	@Test
	public void InsertAPalindromeAllLowercase()
	{
		assertEquals(true, Palindrome.IsPalindrome("deleveled"));
	}

     @Test
     public void PassThroughAnEmptyString()
     {
    	 assertEquals(false, Palindrome.IsPalindrome(""));
     }

     @Test
     public void PassThroughAPalindromeWithNumbers()
     {
    	 assertEquals(true, Palindrome.IsPalindrome("1DeLevEled1"));
     }

     @Test
     public void PassThroughAnOddPalindrome()
     {
    	 assertEquals(true, Palindrome.IsPalindrome("testtset"));
     }
}
