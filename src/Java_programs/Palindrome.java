package Java_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String str1=s.nextInt();
		int n=s.nextInt();
		int temp=n,reverse=0,rem;
		//temp=num;
		while(n>0) {
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
			//temp/=10;
			}
		//System.out.println(reverse);
		if(temp==reverse) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is a not palindrome");
		}
s.close();	}

}
