package SetProgram;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lob = new LinkedHashSet<>();
		lob.add(null);
		lob.add(11);
		lob.add(26);
		lob.add(93);
		lob.add(95);
		
		lob.add(114);
		// lob.add(95); duplicate is not allowed
		// lob.add(null); singal null value
		// It maintains order
		// It takes null value
		
		System.out.print(lob + " ");
	}
}
