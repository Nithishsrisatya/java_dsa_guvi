//package Learning Process.Step 4;
import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a rowSize: ");
        int rows = obj.nextInt();
        System.out.println("Enter a columnSize: ");
        int cols = obj.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the Matrix: ");
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                matrix[i][j] = obj.nextInt();
            }
        }
        System.out.println("Transpose Matrix is: ");
        for(int i = 0;i < cols;i++){
            for(int j = 0;j < rows;j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}
