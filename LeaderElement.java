package arrays;

public class LeaderElement {

	public static void main(String[] args) {
		int arr[]= {7,10,4,10,6,5,2},n=7;
		leaders(arr,n);

	}
//Efficient code : - theta(n) time	
	/*static void leaders(int arr[],int n) {
		int curL = arr[n-1];
		System.out.print(curL + " ");
		for(int i= n-2;i>=0;i--) {
			if(curL< arr[i]) {
				curL= arr[i];
			    System.out.print(curL+" ");
			}
		}
	}*/
//naive solution theta(n square)	
	static void leaders(int arr[],int n) {
		for(int i=0;i<n;i++) {
			boolean flag= false;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
