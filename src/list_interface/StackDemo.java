package list_interface;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.Stack;

//The stack is a linear data structure that is used to store the collection of objects. 
//It is based on Last-In-First-Out (LIFO).
public class StackDemo {

	public static void main(String[] args) {

		// creating an instance of Stack class
		Stack<Integer> stk = new Stack<>();
		// checking stack is empty or not
		boolean result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		// pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
	
		// prints elements of the stack
		System.out.println("Elements in Stack: " + stk);
		
        Collections.shuffle(stk, new Random());
		
		//pop get the last push value from stack 
		System.out.println("pop stack: " +stk.pop());  
		
		//iteration over the stack  
		Iterator<Integer> iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
			//Object values = iterator.next();  
			System.out.println(iterator.next());   
		}   
		
		ListIterator<Integer> ListIterator = stk.listIterator(stk.size());  
		System.out.println("Iteration over the Stack from top to bottom:");  
		while (ListIterator.hasPrevious())   
		{  
			Integer avg = ListIterator.previous();  
			System.out.println(avg);  
		}  
		
		
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);
	}
}
