package Java_programs;

import java.util.Scanner;

public class Amostrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=s.nextInt();
		int rem,sum=0,result=n;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(result==sum) {
			System.out.println("Its is Amstrong");
		}
		else {
			System.out.println("It is a Not amstrong");
		}

	}

}
