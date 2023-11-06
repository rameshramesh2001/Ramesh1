package Java_pratice_programs;

public class Basic2 {
	/*public static void hello() {
		System.out.println("Before Hello world");
	}

	public static void main(String[] args) {
		hello();
		System.out.println("Hello world");*/
	public static void main(String[] args) {
		//int arr[]= {10,20,30,40,50};
		int a[]= {1,2,3};//3
		int b[]= {4,5,6};//3
		int len=a.length+b.length;
		int c[]=new int[len];//3+3=6
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}//c[]={1,2,3,0,0,0}
		int j=0;
		for(int i=a.length;i<c.length;i++) {
			c[i]=b[j];
			j++;
			//c[a.lenth+i]=b[i];
		}//c[]={1,2,3,4,5,6}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+" ");
		//System.out.println(Arrays.toString(c));
		//for(int i=0;i<c.lenth;i++) {
			
			
		
		
		//for(int i=0;i<arr.length;i++) {
			//System.out.print(" "+arr[0]);
		}
		//System.out.println(10%11);
		

	}

}
