public class Driver {
    public static void main(String[] args){
	MyStack a = new MyStack();
	a.push("one");
	System.out.println(a);
	a.push("two");
	System.out.println(a);
	a.push("three");
	System.out.println(a);
	while (!a.isEmpty()){
	    System.out.println(a.pop());
	}
	a.push("Hello");
	System.out.println(a.peek());
	System.out.println(a);
	a.push("world");
	System.out.println(a.peek());
	System.out.println(a);
	
    }
    
}
