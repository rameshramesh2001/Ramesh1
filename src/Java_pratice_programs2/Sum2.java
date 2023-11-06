package Java_pratice_programs2;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		n=s.nextInt();
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("My value:"+sum);

	}

}
