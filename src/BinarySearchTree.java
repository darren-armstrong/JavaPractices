
public class BinarySearchTree {
	
	public static boolean Contains(Node root, int value){
		while(root != null){
			if(root.value == value){
				return true;
			}
			root = root.value > value ? root.left : root.right;
		}
		return false;
	}
}

class Node{
	public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
