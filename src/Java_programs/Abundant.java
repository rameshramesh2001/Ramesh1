package Java_programs;

import java.util.Scanner;

public class Abundant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n;
		n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum=sum+i;
		//for(int i=1;i<=5;i++) {
			//System.out.println("ramesh");
		}
		if(sum>n) {
			System.out.println("It is a abundant");
		}
		else {
			System.out.println("It is not abundant");
		}
	}

}
