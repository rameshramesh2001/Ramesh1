package Java_pratice_programs2;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2) {
			System.out.println("Largest number is: "+num1);
		}
		if(num3>num1) {
			System.out.println("Largest number is: "+num3);
		}
		else {
			System.out.println("Largest number is: "+num2);
		}

	}

}
