import java.util.*;
import java.io.*;

public class LLIterator <E> implements Iterator<E> {

    private Node <E> current;

    public LLIterator (Node <E> n) {
	current = n;
    }



    //hasNext 
    public boolean hasNext() {
	return current.getNext() != null;
    }

    //Next 
    public E next () {
	current = current.getNext();
	return current.getData();
    }

    //Remove 
    public void remove () {
    }
}
