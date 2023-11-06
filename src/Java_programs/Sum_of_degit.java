package Java_programs;

import java.util.Scanner;

public class Sum_of_degit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n,sum=0,digit;
		n=s.nextInt();
		//for(int i=0;i<=n;i++) {
		while(n!=0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
System.out.println("Sum of digit:"+sum);
	}

}
