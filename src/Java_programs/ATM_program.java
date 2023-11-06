package Java_programs;

import java.util.Scanner;

public class ATM_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice,balance=20000,amount;
		int ch;
		do {
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.balance");
			System.out.println("4.exit");
			System.out.println("Enter your choice: ");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				amount=s.nextInt();
				balance=balance-amount;
				System.out.println("balance"+balance);
				break;
			case 2:
				amount=s.nextInt();
				balance=balance+amount;
				System.out.println("balance"+balance);
				break;
			case 3:
				System.out.println("balance"+balance);
				break;
			case 4:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid value");
			}
			System.out.println("Do you want continue y or n");
			ch=s.next().charAt(0);
		}while(ch=='y' || ch=='n');

	}

}
