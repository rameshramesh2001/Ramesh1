package Java_pratice_programs2;

import java.util.Scanner;

public class Prime_or_not1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= {13,17,21,31,5,999991,23,25};
		System.out.println("My number is: ");
		int count=0;
		for(int i=0;i<arr.length/2;i++) {
			arr[i]=s.nextInt();
			for(int j=0;j<arr.length;j++) {
				for(int k=1;k<=arr[j];k++) {
					if(arr[j]%k==0) {
						count++;
					}
				}
			}
			//if(arr.length%i==0) {
				//flag=1;
				//break;
				//System.out.println(arr[j]);
			//}
		}
		if(count==0) {
			System.out.println(arr[j]);
			count=0;
		}
		else {
			System.out.println("Notprime");
		}

	}

}
