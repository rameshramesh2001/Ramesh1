package Java_pratice_programs;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the star: ");
		int n;
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
