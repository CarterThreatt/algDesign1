// Carter T. Threatt
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the rows for matrix 1: ");
		int matrix1_Rows = key.nextInt();
		
		System.out.println("Enter columns for matrix 1: ");
		int matrix1_Columns = key.nextInt();
		
		System.out.println("Enter the rows for matrix 2: ");
		int matrix2_Rows = key.nextInt();
		
		System.out.println("Enter columns for matrix 2: ");
		int matrix2_Columns = key.nextInt();
		
		if (matrix1_Columns != matrix2_Rows) {
			
			System.out.println("Error. Dimensions are Mismatched.");
			System.exit(0);
		}
		
		// create the 2 matrix based on user Dimension
		
		int [][] matrix1 = new int [matrix1_Rows][matrix1_Columns];
		int [][] matrix2 = new int [matrix2_Rows][matrix2_Columns];
		
		//Fill Matrix 1
	
		for(int i = 0; i < matrix1_Rows; i++) {
			for(int j = 0; j < matrix1_Columns; j++) {
				
				System.out.println("Enter the value of matrix 1 position (" + i + "," + j + ")");
				matrix1[i][j] = key.nextInt();
			}
		}
	
		for(int i = 0; i < matrix2_Rows; i++) {
			for(int j = 0; j < matrix2_Columns; j++) {
				
				System.out.println("Enter the value of matrix 2 position (" + i + "," + j + ")");
				matrix2[i][j] = key.nextInt();
			}
		}
		
		// Compute the sum of Matrix 1 and 2
		int[][] sumMatrix = new int[matrix1_Columns][matrix1_Rows];
		for(int i = 0; i < matrix1_Rows; i++) {
			for(int j = 0; j < matrix1_Columns; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];	
			}
		}
		
		// Print the sum of Matrix 1 and 2
		System.out.println("Sum of Matrix 1 and Matrix 2: ");
		for (int i = 0; i < matrix1_Rows; i++) {
            for (int j = 0; j < matrix2_Columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
		
	}

}
}
