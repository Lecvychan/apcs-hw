public class DoubleLL <E> {
    //worked on with Emily Ruby
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
	    data =d;
	}
	public E getData () {
	    return data;
	}
	public void setNext (Node <E> n) {
	    next =n;
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
	    if (current.prev == null && current.next ==null){
		current.next = n;
		n.prev = current;
	    }
	    if (current.prev != null){
		n.setPrev(current.prev);
		current.prev.setNext(n);
	    }
	    n.next = current;
	    current.prev = n;
	    current = n;
	}
    }
    public E getCurrent() {
	return current.getData();
    }

    public void forward () {
	if (current.getNext() != null)
	    current = current.getNext();
	System.out.println ("forward: " + current);
    }
    public void back() {
	if (current.getPrev() != null)
	    current = current.getPrev();
    }
    public void delete(E d){
	Node<E> tmp = current;

	while ( tmp.next != current){
	    if (tmp.getData()==d){
		tmp.next.setPrev(tmp.prev);
		tmp.prev.setNext(tmp.next);
		current = tmp.next;
	    }
	    tmp = tmp.getNext();
	}
    }
    
    //deletes current
    public void delete(){
	delete(current.getData());
    }
    //confused with what is supposed to be found if the list is circular
    /* public void find(E d){
       Node<E> tmp = current;
       while ( tmp.next != current){
       if (tmp.getData() == d){
       }
       }*/

    public String toString () {
	if (current == null)
	    return "";
	Node <E> tmp = current.next;
	String s = "";
	while (tmp != current) {
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	s = current + " " + s;
	return s;
    }

    public static void main (String [] args) {
	DoubleLL <String> L = new DoubleLL<String> ();
	/* System.out.println (L);
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
	   System.out.println (L);*/
	L.insert("day");
	L.insert("time");
	System.out.println(L);
	L.insert("hour");
	System.out.println(L);
	L.delete();
	System.out.println(L);

    }
}