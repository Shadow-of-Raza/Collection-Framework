package Vactor.Stsck;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo1 
{
	public static void main(String[] args) 
	{
		Stack<Integer> s= new Stack<>();
		
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(500);
		s.push(400);
		
	
		System.out.println(s);
		
		Iterator<Integer> its=s.iterator();
		while(its.hasNext())
		{
			System.out.println(its.next());
		}
		
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search(300));
		
		
	}
}
