package arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = new int[5],n = 3;

	       arr[0] = 5; arr[1] = 10; arr[2] = 20;

	       System.out.println("Before Insertion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       int x = 10;

	       n = delete(arr, n, x);

	       System.out.println("After Deletion");

	       for(int i=0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }


	}
	
	static int delete(int arr[], int n,int x) {
		int i;
		for(i = 0;i<n;i++)
			if(arr[i]==x)
				break;
		if(i==n)
			return n;
		for(int j=i;j<n-1;j++)
			arr[j]=arr[j+i];
		return (n-1);
					
			
	}

}
