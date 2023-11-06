package Java_programs;

import java.util.Scanner;

public class Pattrn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int row;
		int k=1;
		row=s.nextInt();
		for(int i=0;i<=row;i++) {
			for(int space=row;space>i;space--)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
	

	}

}
