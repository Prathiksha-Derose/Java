package com.sc.oops.onedimensionalstandard;

public class MultiDimensionalArray {
	
	public static void array1() {
	
	//row 2 column 2--> two dimensional array
	
			int input[][] = new int[3][4];
			
			input[0][0]=10;
			input[0][1]=20;
			input[0][2]=30;
			input[0][3]=40;
			
			input[1][0]=50;
			input[1][1]=60;
			input[1][2]=70;
			input[1][3]=80;
			
			input[2][0]=90;
			input[2][1]=100;
			input[2][2]=110;
			input[2][3]=120;
			
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<4;j++) {
					System.out.println(input[i][j]);
				}
			}
	}

	public static void main(String[] args) {
         
		array1();
		

}
}
