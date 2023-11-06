package Java_pratice_programs2;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
		LinkedList <String>fruits = new LinkedList<String>();
		//LinkedList <String> fruits2 = new LinkedList<String>();
		//LinkedList <String> fruits3 = new LinkedList<String>();
		fruits.add("Apple");
		
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.set(1, "Aaaa");
		fruits.addFirst("Graphs");
	//	System.out.println(fruits.get(0));
		Collections.sort(fruits);
		for(String i:fruits) {
			 System.out.println(i);
		 }
       // System.out.println(fruits);*/
	}

}
