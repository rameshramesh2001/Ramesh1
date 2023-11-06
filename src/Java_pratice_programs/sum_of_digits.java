package Java_pratice_programs;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=156,rem=0,sum=0;
		//num=s.nextInt();
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("the number is: "+sum);
//s.close();
	}

}
