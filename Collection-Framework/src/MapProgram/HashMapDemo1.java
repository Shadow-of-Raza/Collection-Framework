package MapProgram;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Aa");
		hm.put(2, "Bb");
		hm.put(3, "Cc");
		hm.put(5, "Ee");
		hm.put(4, "Dd");
		// It does not mantain order
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
