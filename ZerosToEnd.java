package arrays;

public class ZerosToEnd {

	public static void main(String[] args) {
		int arr[]= {1,2,0,3,0,5,0,6};
		int n=arr.length;
		System.out.println("Array is:");
		zeros(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	static void zeros(int arr[],int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp= arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
	
	

}
