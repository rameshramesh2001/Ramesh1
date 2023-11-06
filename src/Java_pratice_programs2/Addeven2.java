package Java_pratice_programs2;

import java.util.Scanner;

public class Addeven2 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		n=s.nextInt();
		//for(int i=0;i<=n;i++) {
			if(n%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Add");
			}
		}

	}

