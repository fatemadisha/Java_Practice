package Newtest.Java_try;

public class Problem5 {

	public static void main(String[] args) {
	
		int[][] array = {{10,20,30},   //10 40
				            {40,50,60}};  //20 50
		                                  //30 60
		
	System.out.println("Original Array: " );
	 array_org(array);
	 System.out.println("After changing the rows and columns of the said array:");
	 Swap(array);
	
	}
	
	public static void Swap(int[][] array) {
		
		int[][] array2 = new int[array[0].length][array.length];
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[0].length; j++) {
			
				array2[j][i] = array[i][j];
			}
		}
		
		array_org(array2);
	}
	public static void array_org(int[][] array) {
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}


		
	