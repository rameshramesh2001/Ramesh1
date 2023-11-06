package Java_pratice_programs2;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("1 for parota \n2 for dosa \n3 for itly \n4 biriyani");
		choice = s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("My food parota");
			break;
		case 2:
			System.out.println("My food dosa");
			break;
		case 3:
			System.out.println("My food itly");
			break;
		case 4:
			System.out.println("My food biriyani");
			break;
			default:
				System.out.println("No dish");
		}
		

	}

}
