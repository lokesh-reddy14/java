import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[rows][columns];
        
        // Get user input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Transpose the matrix
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        
        
        
        // Print the transposed matrix
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
