package DataStructures;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		//Declare the array
		int[]a=new int[n];
		//Insert elements into the array
		System.out.println("Enter" +n+"elements into the array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element to be searched");
		int key=sc.nextInt();
		
		int index=-1;
		for(int i=0;i<n;i++) {
			
			if(key==a[i]) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		
		
		

	}

}
