package arrays;

public class SearchArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9};
		int n=arr.length;
        int x=6;
        System.out.println(search(arr,n,x));
	}
	static int search(int arr[],int n, int x) {
		for(int i=0;i<n-1;i++) {
			if(arr[i]==x)
				return i;
			
		}
		return -1;
	}

}
