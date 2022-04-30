package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {10,20,20,30,30,30,30}, n=7;
		System.out.println(remdup(arr,n));

	}
	
	static int remdup(int arr[],int n) {
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!= arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}

}
