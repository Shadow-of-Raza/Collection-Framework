package ListPrograms;

import java.util.ArrayList;

// How to copy or clone a ArrayList?
public class ArrayListDemo3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr=new ArrayList<>();
		arr.add("A");
		arr.add("B"); 
		arr.add("C");
		arr.add("D");
		arr.add("E");
		
		System.out.println("Actual ArrayList: " + arr);
		
		ArrayList<String> cpy = (ArrayList<String>)arr.clone();
		System.out.println("Cloned ArrayList: " + cpy);
	}
}
