package Java_programs;

import java.util.Scanner;

public class Postive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num=0;
		
		num=s.nextInt();
		if(num>0) {
			System.out.println("Is a positive");
		}
		else if(num==0) {
			System.out.println("Is a Zero");
		}
		else {
			System.out.println("Is a nagative number");
		}

	}

}
