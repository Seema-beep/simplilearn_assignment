package DataStructures;
import java.util.*;


//Binary Search Implementation
class Demo{
	static int binarySearch(int a[],int key) {
		
		int low=0,high=a.length-1,mid;
		while(low<=high) {
			mid=(low+high)/2;
			
			if(a[mid]==key)
				return mid;
			else if(a[mid]<key)
				low=mid+1;
			else 
				high=mid-1;
				
			
		}
		return -1;
	}
}




public class BinarySearchVersion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		//Declare the array
		int a[]=new int[n];
		//Populate  the array
		System.out.println("Enter"+n+"values to be searched");
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		
			
			System.out.println("Enter the value to be searched");
			int key=sc.nextInt();
			
			Arrays.sort(a);
			/*System.out.print("the ellements after sorting are");
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}*/
			
			System.out.println(Demo.binarySearch(a,key));
			
			
			
		}
		
		
		

	}


