package Newtest.Java_try;

public class Problem4 {

	public static void main(String[] args) {
		
	boolean[][] array = {
			{true, false, true},
			{false, true, false,true},
			{true, false}
	};
	
	int rows = array.length;
	
	
	for(int i=0; i<rows; i++) {
		int columns = array[i].length;
	for(int j= 0; j<columns; j++) {
		
		if(array[i][j]) {
			System.out.print("t");
		}
		else {
			System.out.print("f");
		}
		
	}
	System.out.println();
	}
	

	}

}
