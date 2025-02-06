//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jailyn Perales

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue; // Holds the given String 
	private Stack<String> stack; // Holds the given String in reverse
	private String str; // The given String
	private String res; // Whether its a palin list or not

/*
	This PalinList() method is a non parameterized constructer
*/
	public PalinList(){
	    queue = new LinkedList<String>();
	    stack = new Stack<String>();
	    str = "";
		setList(str);
	}
	
/*
	This PalinList(String list) method is a parameterized constructer that 
   	 initializes the stack and queue and takes the string to run setList()
*/
	public PalinList(String list){
	    queue = new LinkedList<String>();
	    stack = new Stack<String>();
	    str = list;
	    setList(str);
	}

/*
	This setList(String list) method takes the given string and splits it up into 
    	both a stack and queue then runs isPalin() to determine the result

*/
	public void setList(String list){
	    // Setting the Stack
	    String foList = list;
	    while(foList.length() > 0){
	        if(foList.indexOf(" ") > 0){
	            stack.push(foList.substring(0,foList.indexOf(" ")));
	            foList = foList.substring(foList.indexOf(" ") + 1);
	            
	        }
	        else{
	            stack.push(foList);
	            foList = "";
	        }
	        
	    }
	    
	    // Setting the Queue
	    foList = list;
	    while(foList.length() > 0){
	        if(foList.indexOf(" ") > 0){
	            queue.add(foList.substring(0,foList.indexOf(" ")));
	            foList = foList.substring(foList.indexOf(" ") + 1);
	            
	        }
	        else{
	            queue.add(foList);
	            foList = "";
	         }
	    }
	    // checking if Palin 
	    if(isPalin()){
	        res = "is a palinlist.";
	    }
	    else{
	        res = "is not a palinlist.";
	    }
	    
	    
	}

/*
This isPalin() method checks that the last item in the list is the same 
    	as the first to make sure it palin and if not it returns false

*/
	public boolean isPalin(){
	    boolean product = true;
	    while(!stack.isEmpty()){
	        if(stack.pop().equals(queue.remove())){
	            product = true;
	        }
	        else{
	            return false;
	        }
	    }
		return product;
	}


/*
    This toString() method returns the string and whether or not its palin
*/
	public String toString(){
	    return "[" + str + "] " + res;
	}
}

