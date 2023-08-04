package SetProgram;



import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 
{
	public static void main(String[] args) {
		HashSet<Integer> hob = new HashSet<Integer>();
		
		hob.add(null);
		hob.add(11);
		hob.add(26);
		hob.add(93);
		hob.add(114);
		hob.add(95);
		// HashSet does not maintains order.
		//hob.add(5); It is not allow the duplicate values
		//hob.add(null); Single null value are allowed.

		System.out.print(hob  + " ");
		
		Iterator<Integer> it = hob.iterator();
		
		while(it.hasNext())
		{
			int local = (int) it.next();
			System.out.println("Set Data: " + local);
		}
		
	}
}
