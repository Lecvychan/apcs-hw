public class BST {
    private Node root;

    public BST() {
        root = null;
    }
    public BST (int n) {
	root = new Node (n);
    }

    public void insert (int n) {
	Node tmp = root;
	Node pig = tmp;
	while (tmp != null) {
	    pig = tmp;
	    if (n > tmp.getData())
		tmp = tmp.getRight();
	    else 
		tmp = tmp.getLeft();
	}
	if (n > pig.getData())
	    pig.setRight(n);
	else
	    pig.setLeft(n);
    }

    public Node searchI (int n) {
	Node tmp = root;
	while (tmp != null) {
	    if (n == tmp.getData())
		return tmp;
	    else if (n > tmp.getData())
		tmp = tmp .getRight();
	    else if (n < tmp.getData())
		tmp = tmp.getLeft();
	    else 
		break;
	}
	return tmp;
    }

    public Node searchR(Node n, int i) {
	if (n == null)
	    return null;
	else if ( i == n.getData())
	    return n;
	else if (i > n.getData())
	    return searchR(n.getRight(), i);
	else if (i < n.getData())
	    return searchR(n.getLeft(), i);
	else
	    return null;
    }
}