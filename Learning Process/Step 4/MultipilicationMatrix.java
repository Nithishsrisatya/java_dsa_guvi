//ackage Learning Process.Step 4;
import java.util.*;
public class MultipilicationMatrix {
    public static void multipilicationOfTwoMatrix(int row1, int col1,int[][] mat1,int row2, int col2,int[][] mat2){
        int[][] result = new int[row1][col2];
        if(col1 != col2 || row1 != row2){
            System.out.println("Matrix multipilication is not possible");
        }
        else{
            for(int i = 0;i < row1;i++){
                for(int j = 0;j < col2;j++){
                    for(int k = 0;k < col1;k++){
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            for(int i = 0;i < row1;i++){
                for(int j = 0;j < col2;j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("First Matrix: ");
        System.out.println("Enter a rowSize: ");
        int row1 = obj.nextInt();
        System.out.println("Enter a columnSize: ");
        int col1 = obj.nextInt();
        int[][] mat1 = new int[row1][col1];
        System.out.println("Enter the elements of the Matrix: ");
        for(int i = 0;i < row1;i++){
            for(int j = 0;j < col1;j++){
                mat1[i][j] = obj.nextInt();
            }
        }
        System.out.println("Second Matrix: ");
        System.out.println("Enter a rowSize: ");
        int row2 = obj.nextInt();
        System.out.println("Enter a columnSize: ");
        int col2 = obj.nextInt();
        int[][] mat2 = new int[row2][col2];
        System.out.println("Enter the elements of the Matrix: ");
        for(int i = 0;i < row2;i++){
            for(int j = 0;j < col2;j++){
                mat2[i][j] = obj.nextInt();
            }
        }
        multipilicationOfTwoMatrix(row1,col1,mat1,row2,col2,mat2);
        obj.close();
    }
}
