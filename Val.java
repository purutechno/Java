package matrixx;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("M1 : No of rows :");
		int row = input.nextInt();
		System.out.println("M1 : No of columns : ");
		int col = input.nextInt();
		System.out.println("M2 : No of rows :");
		int row2 = input.nextInt();
		System.out.println("M2 : No of columns : ");
		int col2 = input.nextInt();
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row2][col2];
		int[][] result = new int[row][col2];
		if (col == row2) {
			for(int a=0;a<row;a++) {
				for(int b=0;b<col;b++) {
					System.out.printf("M1 : Element of %d row %d column",(a+1),(b+1));
					matrix1[a][b]= input.nextInt();
				}
			}
			for (int a=0;a<row;a++) {
				for (int b=0;b<col;b++){
					System.out.printf(matrix1[a][b]+"\t");
				}
				System.out.printf("\n");
			}
			System.out.println("\n \n ");
			for(int a=0;a<row2;a++) {
				for(int b=0;b<col2;b++) {
					System.out.printf("M2 : Element of %d row %d column",(a+1),(b+1));
					matrix2[a][b]= input.nextInt();
				}
			}
			System.out.println("\n" );
			for(int a=0;a<row2;a++) {
				for(int b=0;b<col2;b++) {
					System.out.printf(matrix2[a][b]+"\t");
				}
				System.out.printf("\n");
			}
			System.out.println("M1 X M2 = ");
			int sum = 0;
			for (int a=0;a<row;a++ ) {
				for (int b=0;b<col2;b++) {
					for (int c=0;c<row2;c++) {
							sum = sum + matrix1[a][c]*matrix2[c][b];					
					}
					result[a][b] = sum;
					sum =0;
				}
			}
			for(int a=0;a<row;a++) {
				for(int b=0;b<col2;b++) {
					System.out.printf(result[a][b]+"\t");
				}
				System.out.printf("\n");
			}
		}
		else {
			System.out.println("Matrix Cannot be multiplieds! ");
		}
	}

}
