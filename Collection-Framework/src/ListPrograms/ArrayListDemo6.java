package ListPrograms;

import java.util.ArrayList;
import java.util.List;

// How to find does ArrayList contains all list elements or not?
public class ArrayListDemo6 {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("A");
		arr.add("B"); 
		arr.add("C");
		arr.add("D");
		arr.add("E");
		System.out.println("Actual ArrayList: " + arr);
		
		List<String> lst=new ArrayList<>();
		lst.add("A");
		lst.add("B"); 
		lst.add("C");
		lst.add("D");
		lst.add("E");
		//lst.add("F"); false

		System.out.println("Actual List: " + lst);

		System.out.println(arr.containsAll(lst));
	}
}
