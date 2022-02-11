package snippet;

import java.util.Scanner;
import java.util.Stack;

public class BalancedExpressionCheck {

	Scanner in = new Scanner(System.in);
	  Stack<Integer> stack = new Stack<Integer>();
	  
	  
	  public boolean check()
	  {
	    System.out.println("Please enter your expression.");
	    String newExp = in.next();
	   
	    int size=newExp.length();
		for (int i = 0; i < size; i++)
	    { 
	      char ch = newExp.charAt(i);
	      if (ch == '(' || ch == '[' || ch == '{')
	        stack.push(i);
	      else if (ch == ')'|| ch == ']' || ch == '}')
	      {
	        //nothing to match with
	        if(stack.isEmpty())
	        {  
	          return false;
	        }
	        else if(stack.pop() != ch)
	        { 
	          return false;
	        } 

	      }            
	    }
	    if (stack.isEmpty())
	    {
	      return true;
	    }
	    else
	    {
	      return false;
	    }
	  }


	  
	
	public static void main(String[] args) {
		
		
		BalancedExpressionCheck ck=new BalancedExpressionCheck();
		
		ck.check();
		

	}

}
