package Java_pratice_programs;

public class addnumber {
	public int add_number() {
		int a=10;
		int b=20;
		int sum=a+b;
		//sum=a+b;
		System.out.println("My value is :"+sum);
		return sum;
	}

	public static void main(String[] args) {
		addnumber s1=new addnumber();
		s1.add_number();
		//s1.add_number(30,40);
		//System.out.println("my second number:"+result);
		/*addnumber m1=new addnumber();
		int result =m1.add_number(10,20);
		m1.add_number(20,30);
		System.out.println("My second value:"+result);*/

	}

}
