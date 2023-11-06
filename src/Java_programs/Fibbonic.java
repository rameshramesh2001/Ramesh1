package Java_programs;

import java.util.Scanner;

public class Fibbonic {

	public static void main(String[] args) {
		int a=0,b=0,c=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=s.nextInt();
		//while(i<=n) {
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+a);
		}
	}

}
