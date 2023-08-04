package MapProgram;

import java.util.*;
public class CountCharHashMap 
{
	public static Map<Character, Integer> countCharacters(String str) 
    {
        Map<Character, Integer> charCountMap = new HashMap<>();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
         
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            } else {
                charCountMap.put(c, 1);
            }
           
        }
        return charCountMap;
    }
	
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your String: ");
    	String str = sc.nextLine();
        Map<Character, Integer> charCountMap = countCharacters(str);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
