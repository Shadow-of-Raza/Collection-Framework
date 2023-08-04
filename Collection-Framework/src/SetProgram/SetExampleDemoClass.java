package SetProgram;

import java.util.HashSet;
import java.util.Iterator;

public class SetExampleDemoClass 
{
	public static void main(String[] args) {
		HashSet hob = new HashSet();
		hob.add("Java");
		hob.add("Full");
		hob.add("Stack");
		hob.add("Program");
		
		System.out.print("HashSet Element: " + hob);
		System.out.println();
		
		Iterator it = hob.iterator();
		
		while (it.hasNext()) {
			String local = (String) it.next();
			System.out.print(local + " ");
		}
	}
}
