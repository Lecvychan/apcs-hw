import java.util.*;
import java.io.*;
import java.util.Scanner;

public class RPN {
    private MyStack stack = new MyStack();

    public String RPN (String s) {
	int index = 0;
    
 
    
    public void add() {
	String ans = "";
	for (int i = 0; !stack.isEmpty() && i < 2; i ++ )
	    ans += stack.pop();
	stack.push(ans+ "");
    }
    public void subtract () {
	String ans = 0;
	if (!stack.isEmpty())
	    ans = stack.pop();
	if (!stack.isEmpty())
	    ans = stack.pop() - ans;

	stack.push (ans);
    }
    public void multiply () {
	String ans = 0;
	if (!stack.isEmpty())
	    ans = stack.pop();
	if (!stack.isEmpty())
	    ans *= stack.pop();
	stack.push (ans);
    }
    public void divide () {
	String ans = 0;
	if (!stack.isEmpty())
	    ans = stack.pop();
	if (!stack.isEmpty())
	    ans = stack.pop() / ans;
	stack.push (ans);
    }

    public void solve () {



    public static void main (String [] args){
	RPN rpn = new RPN();

	Scanner scan = new Scanner (System.in);
	String getNext;
	while (true) {
	    getNext = scan.nextLine();
	    if (getNext.equals ("+"))
		rpn.add();
	    if (getNext.equals ("-"))
		rpn.subtract();
	    if (getNext.equals ("*"))
		rpn.multiply ();
	    if (getNext.equals ("/"))
		rpn.divide();
	    else {
		double num = Double.parseDouble(getNext);
		stack.push (num);
	    }
	}
    }
}