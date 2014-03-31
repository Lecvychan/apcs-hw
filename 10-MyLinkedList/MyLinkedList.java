public class MyLinkedList<T> implements Iterable <T>{
    private Node <T> head;
    private Node <T> tail;


    public MyLinkedList() {
	head  = new Node <T>(); 
	tail = null;
    }

    //Iterator
    public Iterator <T> iterator (){
	return new LLIterator <T> (head);
    }




    //ADD
    public void add (T d) {
	Node<T> tmp = new Node (d);



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
    public void add (int i, T s) {
	if (this.length() == 1)
	    this.add(s);
	Node <T> tmp = head.getNext();
	Node <T> temp = new Node<T> (s);
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
    public T get (int i) {
	Node <T> tmp = head.getNext();
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
    public T set (int i, T s) {
	Node<T> tmp = head.getNext();
	try{
	for (int j = 0; j < i; j++) {
	    tmp = tmp.getNext();
	 
	}
	Node<T> temp = tmp;
	tmp.setData(s);
	return temp.getData();
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return null;
    }

    //addLast
    public T addLast (T s) {
	Node<T> tmp = head.getNext();
	Node<T> end = new Node<T> (s);
	while (tmp.getNext() != null)
	    tmp = tmp.getNext();
	tmp.setNext(end);
	tail = end;
	System.out.println ("Tail: " + tail);
	return s;
    }

    //REMOVE
    public T remove (int i) {
	Node<T> tmp = head;
	T removed = null;
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
    public int find (T s) {
	Node<T> tmp = head.getNext();
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
	Node<T> tmp = head.getNext();
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
