package Java_pratice_programs2;

import java.util.Scanner;

public class Dinemination {

	public static void main(String[] args) {
		int amt,rs100=0,rs50=0,rs20=0,rs10=0,rs5=0,rs2=0,rs1=0,result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		amt=s.nextInt();
		if(amt>=100) {
			rs100=amt/100;
			amt=amt%100;
			System.out.println("My amount 100 is:"+rs100);
		}
		if(amt>=50) {
			rs50=amt/50;
			amt=amt%50;
			System.out.println("My amount 50 is:"+rs50);
		}
		if(amt>=20) {
			rs20=amt/20;
			amt=amt%20;
			System.out.println("My amount 20 is:"+rs20);
		}
		if(amt>=10) {
			rs10=amt/10;
			amt=amt%10;
			System.out.println("My amount 10 is:"+rs10);
		}
		if(amt>=5) {
			rs5=amt/5;
			amt=amt%5;
			System.out.println("My amount 5 is:"+rs5);
		}
		if(amt>=2) {
			rs2=amt/2;
			amt=amt%2;
			System.out.println("My amount 2 is:"+rs2);
		}
		
		if(amt>=1) {
			rs1=amt/1;
			amt=amt%1;
			System.out.println("My amount 1 is:"+rs1);
		}
	result=rs100+rs50+rs20+rs10+rs5+rs2+rs1;
	System.out.println("No of notes is: "+result);

	}

}
