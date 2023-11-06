package Java_pratice_programs;

public class reverse {

	public static void main(String[] args) {
		int num=123456,rem=0,reverse=0;
		//while(num>0) {
		for(int i=0;i<num;i=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("Reverse num is: "+reverse);
		

	}

}
