package Java_pratice_programs2;

public class Array {

	public static void main(String[] args) {
		int j;
		int arr[]= {1,50,9,80,14,79,24,59,39};
		for(int i=0;i<arr.length;i++) {
			//if(i<arr.length) {
			//j=arr[i+1];
			//j++;
			//for(int i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
			//System.out.println(i+": "+arr[i]);
			//System.out.println(i+": "+arr[j]);
			if(arr[i]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				//System.out.println("temp: "+temp);
			}
			//System.out.println(i+" "+arr[i]);
			//System.out.println(j+" "+arr[j]);
			}
			System.out.println(arr[i]);
			//System.out.println("temp: "+temp);
			//System.out.println(arr[j]);
			}
		//System.out.println(arr[i][j]);
		//int j=0;
		/*for(j=i+1;j<arr.length;j++) {
			System.out.println(" "+arr[j]);
		}*/

	}

}
