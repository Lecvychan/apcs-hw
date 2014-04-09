import java.util.*;
import java.io.*;
import java.util.Scanner;

public class RPN {
    private Scanner sc;
    private MyStack ms;
    private int index;
    private int a; 
    private int b;
   
    public RPN () {
	sc = new Scanner (System.in);
	ms = new MyStack();
	index = 0;
	int a = 0;
	int b = 0;
    }

    
    public String solve () {
	String s = sc.nextLine();
	for (int i = 0; i < s.length(); i++) {
	    ms.push (s.substring(i, i + 1));
	}

	while (index < s.length()){
	    String frag = s.substring (index, index + 1);
	    if (frag.equals("+")){
		a = Integer.parseInt(ms.pop());
		b = Integer.parseInt(ms.pop());
		ms.push(""+(a+b));
	    }
	    else if (frag.equals("-")){
		b = Integer.parseInt(ms.pop());
		a = Integer.parseInt(ms.pop());
		ms.push(""+(a-b));
	    }
	    else if (frag.equals("*")){
		a = Integer.parseInt(ms.pop());
		b = Integer.parseInt(ms.pop());
		ms.push(""+(a*b));
	    }
	    else if (frag.equals("/")){
		a = Integer.parseInt(ms.pop());
		b = Integer.parseInt(ms.pop());
		ms.push(""+(b/a));
	    }
	    else if (frag.equals(" ")){}
	    else{
		while (!s.substring(index+1,index+2).equals(" ")){
		    index++;
		    frag+=s.substring(index, index+1);
		}
		ms.push(frag);
	    }
	    index++;
	}

	return ms.pop();
    }


    public static void main (String [] args){
	RPN rpn = new RPN();
	System.out.println ("calculate: ");
	System.out.println(rpn.solve());

    }
}