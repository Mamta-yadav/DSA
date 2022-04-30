package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {2,4,6,7,10},n=5;
		System.out.println("Before Reverse:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		Reverse(arr,n);
		System.out.println("After Reverse:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		

	}
	
	static void Reverse(int arr[],int n) {
		int low=0,high=n-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
			
		}
	}

}
