package Java_programs;

public class Reverse {

	public static void main(String[] args) {
		int reverse=0,rem,num=123456;
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
System.out.println(reverse);
	}

}
