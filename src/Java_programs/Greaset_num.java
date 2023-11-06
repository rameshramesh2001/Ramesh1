package Java_programs;

import java.util.Scanner;

public class Greaset_num {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value: ");
		int a,b,c;
		a=s.nextInt();
		
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c) {
			
			System.out.println("A is biggest: "+a);
		}
		else if(b>a && b>c){
			System.out.println("B is biggest: "+b);
		}
		else {
			System.out.println("C is biggest: "+c);
		}

	}

}
