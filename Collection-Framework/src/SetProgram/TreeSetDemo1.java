package SetProgram;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> tob = new TreeSet<Integer>();
		// By default it is assending order.
		//tob.add(null); not allow null value
		
		tob.add(26);
		tob.add(93);
		tob.add(114);
		tob.add(95);
		tob.add(11);
		// It is sorted.
		// tob.add(95); //duplicate is not allowed
		// It maintains order
		
		System.out.print(tob + " ");
	}
}
