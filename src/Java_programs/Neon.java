package Java_programs;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value: ");
		num=s.nextInt();
		int sqr=num*num;
		while(sqr!=0) {
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
		}
		if(num==sum) {
			System.out.println("Neon number: "+num);
		}
		else {
			System.out.println("Not a neon number: "+num);
		}
		//System.out.println("My value is: "+sum);
		

	}

}
