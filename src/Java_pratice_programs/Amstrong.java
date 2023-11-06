package Java_pratice_programs;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		//method(n);
		
	//static void method(int n) {
		int rem=0,sum=0,temp=n;
		//num=n;
		
		//while(n>0) {
		for(int i=0;i<n;i=0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Is a amstorng");
		}
		else {
			System.out.println("Is a not amstorng");
		}

	
		//System.out.println(sum);
		}
	}