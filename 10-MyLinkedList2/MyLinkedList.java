public class MyLinkedList {
    private Node head;
    private Node tail;
    public MyLinkedList() {
	head  = new Node ("0"); 
	tail = null;
    }
    public void add (String d) {
	Node tmp = new Node (d);



	/*
        head.setNext(tmp);
	We can't set head's next to tmp because head is null. 
	Just make a new node and set head to it.
	*/
	//head = tmp;
	tmp.setNext(head.getNext());
	head.setNext(tmp);
	if(this.length() == 2)
	    tail = tmp;     

    }

    //ADD METHOD
    public void add (int i, String s) {
	if (this.length() == 1)
	    return this.add(d);
	Node tmp = head.getNext();
	Node temp = new Node (s);
	for (; i > 1; i--) {
	    tmp = tmp.getNext();
	    
	}
	temp.setNext(tmp.getNext());
	tmp.setNext(temp);


    }

    //GET
    public String get (int i) {
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
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

    //addLast
    public String addLast (String s) {
	Node tmp = head.getNext();
	while (tmp.getNext() != null)
	    tmp = tmp.getNext();
	tmp.setNext( new Node (s));
	return s;
    }

    //REMOVE
    public String remove (int i) {
	Node tmp = head;
	String removed = "";
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
	return "";
    }

    //Find
    public int find (String s) {
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
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
