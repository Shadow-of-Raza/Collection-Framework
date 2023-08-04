package ListPrograms;

import java.util.ArrayList;

public class ArrayListDemo1 
{
	public static void main(String[] a){
        
        ArrayList<String> al = new ArrayList<String>();
        //add elements to the ArrayList
        al.add("JAVA");
        al.add("C++");
        al.add("PERL");
        al.add("PHP");
        System.out.println(al); // print the array list
        //get elements by index
        System.out.println("Element at index 1: "+al.get(1)); // to get the element for a perticular index use .get()
        System.out.println("Does list contains JAVA? "+al.contains("JAVA")); // To check the data contains in a arraylist use .contains()
        //add elements at a specific index
        al.add(2,"PLAY"); // After creating a ArrayList or you want to add some more data in a perticular index use .add()
        System.out.println(al);
        System.out.println("Is arraylist empty? "+al.isEmpty());// To check arraylist is empty or not use isEmpty()
        System.out.println("Index of PERL is "+al.indexOf("PERL")); // To get the index of a perticular data use indexOf()
        System.out.println("Size of the arraylist is: "+al.size()); // To get the size of an ArrayList use .size()
    }
}
