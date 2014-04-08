public class MyStack {

    private double[] stack;
    private int top;

    public MyStack(){
	stack = new double [10];
	top = -1;
    }

    public void grow () {
	double [] times2 = new double [stack.length * 2];
	for (int i = 0; i <stack.length; i++) 
	    stack = times2;
    }

    public void push(double s){
	top ++;
	while (top >= stack.length) 
	    this.grow();
	stack[top] = s;
    }

    public double pop() {
	double ret = (stack[top]);
	stack[top] = 0;
	top --;
	return ret;
    }

    public double peek() {
	return stack[top];

    }
      
    public int size() {
	return top + 1;
    }

    public boolean isEmpty() {
	return stack[top]== 0;
    }

    public String toString() {
	String s="";
	
	for (int i = top; i >= 0; i--)
	    s += stack[i] + ", ";
    
	return s;
    }
}
