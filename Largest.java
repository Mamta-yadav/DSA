package arrays;

public class Largest {

	public static void main(String[] args) {
		int arr[]= new int[5];
		arr[0]= 5;arr[1]=20;arr[2]=12;arr[3]=30;
		System.out.println("Largest number is at index " + largest(arr));

	}
	
	static int largest( int arr[]) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[res])
				res =i;
			
		}
		return res;
		
	}
	

}
