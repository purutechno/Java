import java.util.Scanner;

public class Val {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Rows of a Matrix : ");
	int row = input.nextInt();
	System.out.println("Enter Columns of a Matrix : ");
	int col = input.nextInt();
	int ele[][] = new int[row][col];
	for (int a=0 ; a<row;a++) {
		for (int b=0 ; b<col ;b++ ) {
			System.out.printf("Enter elements of %d row and %d column : \n",a+1,b+1);
			ele[a][b] = input.nextInt();  
		}
	}
	for (int x=0;x<row;x++) {
		for (int y=0;y<col;y++) {
			System.out.printf(ele[x][y]+"\t");
		}
		System.out.printf("\n");
	}
	Scanner inpu = new Scanner(System.in);
	System.out.println("Enter the rows : ");
	int ro = inpu.nextInt();
	System.out.println("Enter the columns : ");
	int co = inpu.nextInt();
	int mat[][] = new int[ro][co];
	for (int e=0;e<ro;e++) {
		for (int f=0;f<co;f++) {
			System.out.printf("Enter the element of %d row and %d col \n ",e+1,f+1);
			mat[e][f]  = inpu.nextInt();
		}
	}
	for (int g=0;g<ro;g++) {
		for (int h=0;h<co;h++) {
			System.out.printf(mat[g][h]+"\t");
		}
		System.out.printf("\n");
	}
	int sum = 0;
	int res[][] = new int[row][co];
	if (col == ro) {
		for(int i=0;i<row;i++) {
			for (int j=0;j<co;j++) {
				for (int k=0;k<col;k++) {
					sum = sum + ele[i][k]*mat[k][j];
				}
				res[i][j] = sum;
				sum = 0;
			}
		}
		System.out.println("\n"+"\n"+"\n");
		for (int l=0;l<row;l++) {
			for(int m=0;m<co;m++) {
				System.out.printf(res[l][m]+"\t");
			}
			System.out.printf("\n");
	}
	
	}
	else {
		System.out.println("Sorry! The matrix cannot be multiplied !");
	}
	}
}