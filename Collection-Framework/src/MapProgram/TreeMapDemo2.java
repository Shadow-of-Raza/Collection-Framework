package MapProgram;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 
{
	public static void main(String[] args) 
	{
		TreeMap<Long, String> hm = new TreeMap<>();
		hm.put(2347654376l, "Swetha");
		hm.put(4123456789l, "Rani");
		hm.put(5987654321l, "Ansar");
		hm.put(5678765431l, "Akash");
		hm.put(2098654323l, "Saptrishi");
		
		
		System.out.println(hm);
		for (Map.Entry<Long, String> m : hm.entrySet()) {
			long key = m.getKey();
			String val = m.getValue();
			System.out.println(key + " " + val);
		}
		
	}
}
