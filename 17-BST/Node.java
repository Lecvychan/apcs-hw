public class Node {
    private int data;
    private Node left,right;

    public Node (int tempdata) {
	data = tempdata;
	left = null;
	right = null;
    }

    public int getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }

    public void setLeft(int n) {
	left = new Node (n);
    }
    public void setLeft(Node n) { 
      left = n;
 }
    public void setRight(Node n) { 
	right = n;
    }
    public void setRight (int n) {
	right = new Node (n);
    }
    public String toString () {
	return "" + data;
    }
}

