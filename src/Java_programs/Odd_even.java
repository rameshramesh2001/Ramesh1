package Java_programs;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num;
		num=s.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
//System.out.println("");
	}

}
