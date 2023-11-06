package Java_pratice_programs2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	//String fruits;
 public static void main(String[]args) {
	ArrayList <Integer>  Mynumbers=new ArrayList <Integer> ();
	Mynumbers.add(7);
	Mynumbers.add(5);
	Mynumbers.add(1);
	Mynumbers.add(2);
	Mynumbers.add(10);
	//List collection;
	Collections.sort(Mynumbers);
	for(int i:Mynumbers) {
		System.out.println(i); 
	}
	/*arr[0]=50;
	arr[1]=50;
	arr[2]=50;
	arr[3]=50;
	arr[4]=50;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}*/
	
}
}
 