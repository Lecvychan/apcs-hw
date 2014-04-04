public class MyStack {
    private Node top;
    private int numElts;

    //constructor 1
    public MyStack () {
	top = null;
    }
    //push 2
    public void push(String s){
	Node n = new Node (s);
	n.setNext(top);
	top = n;
    }

    //pop
    public String pop(){
	String ret = top.getData();
	top = top.getNext();
	return ret;
    }
    
    //peek

    public String peek() {
	return top.getData ();
    }


    public int size() {
	return numElts;


    //isEmpty

    public boolean isEmpty () {
	/*if (top == null)
	    return true;
	else 
	    return false;
	*/
	return top == null;
    }

    //toString 3
    public String toString() {
	String s = "";
	Node tmp = top;
	//You can use for : (Node tmp = top; tmp != null; tmp =tmp.getNext())
	while (tmp != null) {
	    s = s+ tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	return s.substring (0, s.length() - 2);
    }

}