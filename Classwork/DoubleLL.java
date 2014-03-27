public class DoubleLL <E> {

    private class Node <E> {
	E data;
	Node<E> next,prev;
	public Node (E d) {
	    this.data = d;
	}
	public String toString () {
	    return "" + data;
	}

	public void setData (E d) {
	    data = d;
	}
	public E getData () {
	    return data;
	}
	public void setNext (Node <E> n) {
	    next = n;
	}
	public Node <E> getNext() {
	    return next;
	}
	public void setPrev (Node <E> p) {
	    prev = p;
	}
	public Node <E> getPrev() {
	    return prev;
	}
    }

    private Node <E> current;

    public void insert (E d) {
	Node <E> n = new Node <E> (d);
	if (current == null) {
	    current = n;
	}
	else {
	    if (current.prev != null){
		n.setPrev(current.prev);
		current.prev.setNext(n);
	    }
	    if (current.prev == null && current.next == null){
		n.setPrev(current);
		current.setNext(n);
	    }
	    n.next = current;
	    current.prev = n;
	    current = n;
	}
    }

    public void delete () {
	Node <E> tmp = current.prev;
	Node <E> N = current.next;
	tmp.setNext(N);
	N.setPrev(tmp);
	current = N;
    }
    public E getCurrent() {
	return current.getData();
    }

    public void forward () {
	if (current.getNext() != null)
	    current = current.getNext();
	//System.out.println ("forward: " + current);
    }
    public void back() {
	if (current.getPrev() != null)
	    current = current.getPrev();
    }

    public String toString () {
	Node <E> n = current;
	if (current == null) 
	    return "";
	/*
	while (n.getPrev() != null) 
	    n = n.getPrev();
	*/
	Node <E> tmp = n.getNext();
	String s = "";
	while (tmp != n) {
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	s = n.getData() + " " +  s;
	return s;
    }

    public static void main (String [] args) {
	DoubleLL <String> L = new DoubleLL<String> ();
	/*	System.out.println (L);
	L.insert("hello");
	System.out.println (L);
	L.insert("world");
	System.out.println (L);
	L.insert("three");
	System.out.println (L);
	//First test up to here

	System.out.println (L.getCurrent());
	L.forward();
	System.out.println (L.getCurrent());
	L.insert ("inserted");
	System.out.println (L);
	System.out.println (L.getCurrent());
	L.forward();
	L.forward();
	L.forward();
	L.forward();
	System.out.println (L.getCurrent());
	L.insert ("hi");
	System.out.println (L);
	System.out.println (L.getCurrent());*/
	L.insert("day");
	L.insert("time");
       	System.out.println (L.getCurrent());
	System.out.println(L);
	L.insert ("night");
	L.insert("afternoon");
 	System.out.println ("current: " + L.getCurrent());
	L.forward();
	L.forward();
 	System.out.println ("current: " + L.getCurrent());
	System.out.println(L);
	System.out.println("Delete: " + L.getCurrent());
	L.delete();

	System.out.println(L);
 	System.out.println ("current: " + L.getCurrent());

    }
}

