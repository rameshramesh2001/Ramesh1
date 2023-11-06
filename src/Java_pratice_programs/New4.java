package Java_pratice_programs;

import java.util.Scanner;

public class New4 {

	public static void main(String[] args) {
		int a=0,b=0,c=1;
		//Scanner s = new Scanner(System.in);
		//int n=s.nextInt();
		int n=5;
		for(int i=1;i<=n;i++) {
			//c=a+b;
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+a);
		}

	}

}
