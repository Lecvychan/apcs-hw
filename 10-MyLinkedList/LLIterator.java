import java.util.*;
import java.io.*;

public class LLIterator <T> implements Iterator<T> {

    public Node <T> current;

    public LLIterator (Node <T> n) {
	current = n;
    }



    //hasNext 
    public boolean hasNext() {
	return (current.getNext() != null);
    }

    //Next 
    public T next () {
	current = current.getNext();
	return current.getData();
    }

    //Remove 
    public void remove () {
    }
}
