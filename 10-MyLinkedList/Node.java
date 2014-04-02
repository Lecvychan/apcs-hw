public class Node<T> { 
    private T data;
    private Node <T>  next;

    public Node (T d) {
	data = d;
	next = null;
    }
    public Node () {
	
    }

    public void setData(T d) {
	data = d;
    }
    public T getData() {
	return data;
    }
    public void setNext(Node<T> n) {
	next = n;
    }
    public Node <T> getNext() {
	return next;
    }
    public String toString () {
	return "" + data;
    }
}