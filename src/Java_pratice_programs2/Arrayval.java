package Java_pratice_programs2;

import java.util.Scanner;

public class Arrayval {

	public static void main(String[] args) {
		int num,sum=0;
		int arr[]=new int[6];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		num=s.nextInt();
		System.out.println("enter the values");
		//int arr[]=new int[5];
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("My value is");
for(int i=0;i<=arr.length;i++) {
	sum=sum+i;
	//System.out.println(arr[i]);
}
System.out.println("My original value"+sum);
	}

}
