package Java_pratice_programs;

import java.util.Scanner;

public class Sum_of_n_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n;
		n=s.nextInt();
		//for(int i=0;i<n;i=0) {
				//for(int i=0;i<n;i=0) {
		while(n>0) {
			if(n%10==0) {
				System.out.println("My value is:"+n);
				break;
			}
			n--;
		}
		}

	}

