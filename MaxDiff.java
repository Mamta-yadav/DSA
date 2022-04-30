package arrays;

public class MaxDiff {

	public static void main(String[] args) {
		int arr[]= {2, 3, 10, 6, 4, 8, 1},n=7;
		System.out.println(max(arr,n));

	}

// naive solution theta(n square
	
	/*static int max(int arr[], int n) {
		int res= arr[1]-arr[0];
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				res= Math.max(res , arr[j]-arr[i]);
			}
		}
		return res;
	}*/
	
//efficient solution theta(n)	
	
	static int max(int arr[], int n) {
		int res= arr[1]-arr[0];
		int minval=arr[0];
		for(int j=0;j<n;j++) {
			res= Math.max(res,arr[j]-minval);
			minval=Math.min(minval,arr[j]);
		}
		return res;
	}
	

}
