package ListPrograms;

import java.util.ArrayList;

//How to delete all elements from my ArrayList?
public class ArrayListDemo5 {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("A");
		arr.add("B"); 
		arr.add("C");
		arr.add("D");
		arr.add("E");
		System.out.println("Actual ArrayList: " + arr);

		arr.clear();
		System.out.println("After clear: " + arr);
	}
}
