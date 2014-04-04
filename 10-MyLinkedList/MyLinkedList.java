public class MyLinkedList<E> implements Iterable <E>{
    private Node <E> head;
    private Node <E> tail;


    public MyLinkedList() {
	head  = new Node <E>(); 
	tail = null;
    }

    //Iterator
    public LLIterator  <E> iterator (){
	return new LLIterator <E> (head);
    }




    //ADD
    public void add (E d) {
	Node<E> tmp = new Node (d);



	/*
        head.setNext(tmp);
	We can't set head's next to tmp because head is null. 
	Just make a new node and set head to it.
	*/
	//head = tmp;
	tmp.setNext(head.getNext());
	head.setNext(tmp);
	if(this.length() == 1)
	    tail = tmp;     
	System.out.println ("Tail: " + tail);

    }

    //ADD METHOD
    public void add (int i, E s) {
	if (this.length() == 1)
	    this.add(s);
	Node <E> tmp = head.getNext();
	Node <E> temp = new Node<E> (s);
	for (; i > 1; i--) {
	    tmp = tmp.getNext();
	    
	}
	temp.setNext(tmp.getNext());
	tmp.setNext(temp);
	if (temp.getNext().getNext() == null)
	    tail = temp.getNext(); 
	System.out.println ("Tail: " + tail);
	

    }

    //GET
    public E get (int i) {
	Node <E> tmp = head.getNext();
	try{
	for (int j = 0; j < i; j++) {
	    tmp = tmp.getNext();
	 
	}
	
	return tmp.getData();
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return null;
    }

    //Set 
    public E set (int i, E s) {
	Node<E> tmp = head.getNext();
	try{
	for (int j = 0; j < i; j++) {
	    tmp = tmp.getNext();
	 
	}
	Node<E> temp = tmp;
	tmp.setData(s);
	return temp.getData();
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return null;
    }

    //addLast
    public E addLast (E s) {
	Node<E> tmp = head.getNext();
	Node<E> end = new Node<E> (s);
	while (tmp.getNext() != null)
	    tmp = tmp.getNext();
	tmp.setNext(end);
	tail = end;
	System.out.println ("Tail: " + tail);
	return s;
    }

    //REMOVE
    public E remove (int i) {
	Node<E> tmp = head;
	E removed = null;
	try{
	for (int j = 1; j < i; j++){
	    tmp = tmp.getNext();
    }
	if (i== 0){
	    removed = tmp.getNext().getData();
	    tmp.setNext(tmp.getNext().getNext());
	}
	else{
	    removed = tmp.getNext().getNext().getData();
	    tmp.setNext(tmp.getNext().getNext().getNext());
	}
	return removed;
	
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return null;
    }

    //Find
    public int find (E s) {
	Node<E> tmp = head.getNext();
	int index = 0;
	try{
	while (tmp != null) {
	    if (tmp.getData().equals (s))
		return index;
	    else {
		index ++;
		tmp = tmp.getNext();
	    }
	}
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return -1;
    }

    //Length
    public int length (){
	Node<E> tmp = head.getNext();
	int count = 1;
	if (tmp.equals (null))
	    return 0;
	while (tmp.getNext() != null){
	    count ++;
	    tmp = tmp.getNext ();
	}
	return count;
    }
	    
	    
    public String toString () {
	Node tmp = head.getNext();
	String s = "" + tmp ;
	while (tmp.getNext()!= null) {
	    tmp = tmp.getNext();
	    s = s + ",  " + tmp;	   	   
		}
	return s;
    }
}
