package ListPrograms;

import java.util.ArrayList;

public class ArrayListDemoClass 
{
	public class ArrayListDemo7 
	{
		public static void main(String[] args) 
		{
			ArrayList<String> arr=new ArrayList<>();
			arr.add("A");
			arr.add("B"); 
			arr.add("C");
			arr.add("D");
			arr.add("E");
			arr.add("E");
			arr.add(null);
			System.out.println("Actual ArrayList: " + arr);
			String[] str = new String[arr.size()];
			arr.toArray(str);
			System.out.print("String Array: ");
			for(int i = 0 ; i< str.length ; i++)
			
			{
				System.out.print( str[i] + " ");
			}
			
			
		}
	}
}
