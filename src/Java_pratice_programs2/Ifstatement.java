package Java_pratice_programs2;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		int num1,num2,choice,result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println("1 for addition \n2 for subtraction \n3 for multiplication \n4 for division");
		choice=s.nextInt();
		if(choice==1) {
			result=num1+num2;
			System.out.println(result);
		}
		else if(choice==2) {
			result=num1-num2;
			System.out.println(result);
		}
		else if(choice==3) {
			result=num1*num2;
			System.out.println(result);
		}
		else if(choice==4) {
			result=num1/num2;
			System.out.println(result);
		}
		else {
			System.out.println("Invalid value");
			//System.out.println(result);
			
		}
		//System.out.println(result);
	}

}
