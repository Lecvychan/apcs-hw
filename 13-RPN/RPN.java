import java.util.*;
import java.io.*;
import java.util.Scanner;

public class RPN {
    private MyStack stack = new MyStack();

    public void push (double n){
	stack.push (n);
    }
    public void add() {
	double ans = 0;
	for (int i = 0; !stack.isEmpty() && i < 2; i ++ )
	    ans += stack.pop();
	stack.push(ans);
    }
    public void subtract () {
	double ans = 0;
	if (!stack.isEmpty())
	    ans = stack.pop();
	if (!stack.isEmpty())
	    ans = stack.pop() - ans;

	stack.push (ans);
    }
    public void multiply () {
	double ans = 0;
	if (!stack.isEmpty())
	    ans = stack.pop();
	if (!stack.isEmpty())
	    ans *= stack.pop();
	stack.push (ans);
    }
    public void divide () {
	double ans = 0;
	if (!stack.isEmpty())
	    ans = stack.pop();
	if (!stack.isEmpty())
	    ans = stack.pop() / ans;
	stack.push (ans);
    }


    public static void main (String [] args){
	RPN rpn = new RPN();
	rpn.push (10);
	rpn.push (5);
	rpn.push(2);
	rpn.push(2);
	rpn.push(2);
	rpn.push(2);
	rpn.push(2);
	rpn.push(2);
	rpn.push(2);
	rpn.push(2);
	System.out.println (rpn.stack);
	Scanner scan = new Scanner (System.in);
	String getNext;
	while (true) {
	    getNext = scan.next();
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
		rpn.push (num);
	    }
	}
    }
}