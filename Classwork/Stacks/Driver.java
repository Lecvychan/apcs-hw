public class Driver {
    public static void main (String [] args) {
	MyStack foo = new MyStack();
	foo.push ("one");
	foo.push ("two");
	foo.push ("three");
	System.out.println (foo);
	while (!foo.isEmpty()){
	    System.out.println (foo.pop());
	}



    }
    
}