package arraysprogram;

public class arrayAssisted {

	public static void main(String[] args) {
		//Single-dimensional array
		int a[]= {10,20,30,40,50,60};
		for(int i=0;i<5;i++) {
			System.out.println("Elements of array is"+a[i]);
		}
		//multidimensional array
		int [][]b= {{2,4,6,8},{3,6,9}};
		System.out.println("\n Length of row1:"+b[0].length);

	}

}
