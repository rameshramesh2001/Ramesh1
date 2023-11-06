package Java_pratice_programs2;

public class NewArray {

	public static void main(String[] args) {
		int j=0;
		int arr[]= {1,50,9,80,14,79,24,59,39};
		for(int i=1;i<arr.length;i++) {
			//if(arr[i]<arr[i-1]) {
				
			//for(j=i+1;j<arr.length;j++) {
			//System.out.println(i+": "+arr[i]);
			//System.out.println(i+": "+arr[j]);
			if(arr[i]<arr[i-1]) {
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				i=1;
				System.out.println("temp: "+temp);
			}
			//System.out.println(arr[i+1]);
			//System.out.println(" "+arr[i]);
		//	System.out.println(arr[j]);
		//System.out.println(arr[i]);
			//System.out.println("temp: "+temp);
			//System.out.println(arr[j]);
	}
		
		//System.out.println(arr[i][j]);
		//int j=0;
		for(j=0;j<arr.length;j++) {
			System.out.println(" "+arr[j]);
		}

	}
}
