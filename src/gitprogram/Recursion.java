package gitprogram;

public class Recursion {

	public static void main(String[] args) {
		int[] a= {10,12,8,2,20,22};
		recursion(a,1);

	}
	public static void recursion(int[] a, int i) {
		if(a.length==i) {
			return;
		}
		else {
			System.out.println(i+" "+a[i]);
			recursion(a, i+1);
		}
	}

}
