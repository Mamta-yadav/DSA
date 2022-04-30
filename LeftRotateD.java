package arrays;

public class LeftRotateD {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8},n=7,d=3;
		System.out.println("Before Rotation:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("After Rotation");
		leftR(arr,d,n);
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		

	}
	
//Naive Method
	
	/*static void leftRotate(int arr[], int n) {
		int temp= arr[0];
		for(int i=1;i<n;i++)
			arr[i-1]=arr[i];
		arr[n-1]=temp;
	}
	static void leftR(int arr[],int d,int n) {
		for(int i=0;i<d;i++) {
			leftRotate(arr,n);
		}
	}*/
	
//Efficient Method
	
	/*static void leftR(int arr[],int d,int n) {
		int temp[]= new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d-i]=temp[i];
		}
	}*/
//Reversal Code
	static void reverse(int arr[], int low,int high) {
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			
			low++;
			high--;
		}
	}
	static void leftR(int arr[], int d,int n) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	

}
