package MapProgram;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(3, "Cc");
		hm.put(4, "Dd");
		hm.put(5, "Ee");
		hm.put(1, "Aa");
		hm.put(2, "Bb");
		// It is sorted order
		// Key must be unique 
		// Duplicate value is not allowed
		
		System.out.println(hm);
		
		for (Map.Entry<Integer, String> ihm : hm.entrySet()) {
			Integer key = ihm.getKey();
			String val = ihm.getValue();
			System.out.println(key +" " + val);

		}
	}
}
