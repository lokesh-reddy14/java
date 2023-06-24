import java.util.Scanner;

class Matrix {
    int row, col;
    int[][] data;

    Matrix(int r, int c) {
        row = r;
        col = c;
        data = new int[row][col];
    }

    void getData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix transpose() {
        Matrix result = new Matrix(col, row);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                result.data[i][j] = data[j][i];
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        Matrix matrix = new Matrix(r, c);
        matrix.getData();
        matrix.display();
        System.out.println("");
        Matrix transposedMatrix = matrix.transpose();
        transposedMatrix.display();
    }
}
