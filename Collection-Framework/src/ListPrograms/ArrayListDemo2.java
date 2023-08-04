package ListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

//How to read all elements in ArrayList by using iterator?
public class ArrayListDemo2 
{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for (int i = 0; i <= 10; i++) 
		{
			arr.add(i);
		}
		
		Iterator<Integer> itr = arr.iterator();
		while (itr.hasNext()) 
		{
			System.out.print(itr.next()+ " ");
		}
		
	}

}
