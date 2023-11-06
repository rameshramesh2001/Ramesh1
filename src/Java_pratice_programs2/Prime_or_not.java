package Java_pratice_programs2;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		int n;
		boolean flag= true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		n=s.nextInt();
		for(int i=2;
				i<=n/2;
				i++) {
			if(n%i==0) {
				flag= false;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}
