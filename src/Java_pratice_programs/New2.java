package Java_pratice_programs;

public class New2 {

	public static void main(String[] args) {
		int n=153,rem=0,sum=0;
		int temp=n;
		//while(n>0) {
		for(int i=0;i<n;i=0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
if(temp==sum) {
	System.out.println("Is a amstrong");
}
else {
	System.out.println("Is a not amstrong");
}
	}

}
