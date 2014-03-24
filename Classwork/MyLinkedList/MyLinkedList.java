public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
	head = null; 
    }
    public void add (String d) {
	Node tmp = new Node (d);
	/*
        head.setNext(tmp);
	We can't set head's next to tmp because head is null. 
	Just make a new node and set head to it.
	*/
	//head = tmp;
	tmp.setNext(head);
	head = tmp;
    }

    public String toString () {
	String s = "";
	s= "" + head;
	return s;
    }
}