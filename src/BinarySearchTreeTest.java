import static org.junit.Assert.*;
import org.junit.Test;


public class BinarySearchTreeTest {

	@Test
	public void NodeThatDoesContain()
	{
		Node test = new Node(1, null, null);
		assertEquals(true, BinarySearchTree.Contains(test, 1));
	}

	@Test
	public void NodeThatDoesNotContain()
	{
		Node test = new Node(1, null, null);
		assertEquals(false, BinarySearchTree.Contains(test, 2));
	}

	@Test
	public void NodewithNodeValuesThatDoesNotContain()
	{
		Node test = new Node(1, null, null);
		Node test2 = new Node(3, null, null);
		Node test3 = new Node(2, test, test2);
		assertEquals(false, BinarySearchTree.Contains(test3, 10));
	}
	
	@Test
	public void NodewithNodeValuesThatDoesContain()
	{
		Node test = new Node(1, null, null);
		Node test2 = new Node(3, null, null);
		Node test3 = new Node(2, test, test2);
		assertEquals(true, BinarySearchTree.Contains(test3, 3));
	}

}
