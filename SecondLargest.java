package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= new int [5];
		arr[0]=2;arr[1]=5;arr[2]=34;arr[3]=89;
		System.out.println(secondLargest(arr));
		

	}
	
	static int secondLargest(int arr[]) {
		int res=-1,largest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				res=largest;
			    largest=i;
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1 || arr[i]>arr[res])
					res =i ;
				
			}
		}
		return res;
	}

}
