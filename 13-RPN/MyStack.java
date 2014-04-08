 public class MyStack {

    private String[] stack;
    private int top;


    public MyStack(){
	stack = new String [10];
	top = -1;
    }

    public void grow () {
	String [] times2 = new String [stack.length * 2];
	for (int i = 0; i <stack.length; i++) 
	    stack = times2;
    }

    public void push(String s){
	top ++;
	while (top >= stack.length) 
	    this.grow();
	stack[top] = s;
    }

    public String pop() {
	String ret = new String (stack[top]);
	stack[top] = null;
	top --;
	return ret;
    }

    public String peek() {
	return stack[top];

    }
      
    public int size() {
	return top + 1;
    }

    public boolean isEmpty() {
	return top==-1;
    }

    public String toString() {
	String s="";
	
	for (int i = top; i >= 0; i--)
	    s += stack[i] + ", ";
    
	return s;
    }
}
