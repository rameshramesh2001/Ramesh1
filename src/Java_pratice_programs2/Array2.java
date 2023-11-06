package Java_pratice_programs2;

public class Array2 {

	public static void main(String[] args) {
		int arr[]= new int[]{9,7,8,6,3,1,12,2,5};
		int max=arr[0];
		//int n;
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max>arr[i]) 
				max=arr[i];
				if(small<arr[i]) 
					small=arr[i];
				//max=arr[i];
			//System.out.println(arr[6]);
				//}
			//}
		}
		System.out.println(max);
		System.out.println(small);

	}

}
