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

    //ADD METHOD
    public void add (int i, String s) {
	Node tmp = head;
	Node temp = new Node (s);
	for (; i > 1; i--) {
	    tmp = tmp.getNext();
	    
	}
	temp.setNext(tmp.getNext());
	tmp.setNext(temp);

    }

    //GET
    public String get (int i) {
	Node tmp = head;
	try{
	for (int j = 0; j < i; j++) {
	    tmp = tmp.getNext();
	 
	}
	return tmp.getData();
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return "";
    }

    //Set 
    public String set (int i, String s) {
	Node tmp = head;
	try{
	for (int j = 0; j < i; j++) {
	    tmp = tmp.getNext();
	 
	}
	Node temp = tmp;
	tmp.setData(s);
	return temp.getData();
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return "";
    }

    //REMOVE
    public String remove (int i) {
	Node tmp = head;
	String removed = "";
	try{
	for (int j = 1; j < i; j++){
	    tmp = tmp.getNext();
    }
	removed = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return removed;
	}
	catch (Exception e) {
	    System.out.println (" Passed the end! ");
	}
	return "";
    }

    //Find
    public int find (String s) {
	Node tmp = head;
	int index = 0;
	try{
	while (tmp.getNext() != null) {
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
	Node tmp = head;
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
	Node tmp = head;
	String s = "" + tmp ;
	while (tmp.getNext()!= null) {
	    tmp = tmp.getNext();
	    s = s + ",  " + tmp;	   	   
		}
	return s;
    }
}