package ListPrograms;

import java.util.ArrayList;
import java.util.List;

// How to add all elements of a list to ArrayList?
public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("A");
		arr.add("B"); 
		arr.add("C");
		arr.add("D");
		arr.add("E");
		
		System.out.println("Actual ArrayList: " + arr);
		List<String> lst=new ArrayList<String>();
		lst.add("F");
		lst.add("G");
		arr.addAll(lst);
		lst.addAll(arr);
		System.out.println("Aftra Copy: " + arr );
		System.out.println("Aftra Copy: " + lst );

	}
}
