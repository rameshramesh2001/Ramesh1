package Java_pratice_programs;

//import java.util.Scanner;

public class Fibbonic {

	public static void main(String[] args) {
		//Scanner s= new Scanner(System.in);
		//System.out.println("Enter the number: ");
		//int num1=s.nextInt();
		int num1=0, num2=1,num3=1;
		System.out.println(num1);
		//int num=5,a=0,b=0,c=1;
		for(int i=1;i<=10;i++) {
			System.out.println("My num is: "+num3);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			
		}

	}

}
