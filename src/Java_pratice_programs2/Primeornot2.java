package Java_pratice_programs2;

public class Primeornot2 {
	public static void prime() {
		
		int arr[]= {13,17,21,31,5,99991,21,25};
		int n,count=0;
		for(int i=0;i<arr.length;i++) {
			n=arr[i];
			int loop=0;
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					loop++;
				}
				count++;
				
			}
			if(loop==2) {
				System.out.println("prime: "+arr[i]);
				//count++;
			}
			else {
				System.out.println("Not a prime: "+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		prime();

	}

}
