import java.util.*;
public class TwoD_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of columns: ");
        int coloumns = sc.nextInt();
        int[][] matrix = new int[rows][coloumns];
        System.out.println("Enter elements: ");
        int sum = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < coloumns; j++){
                matrix[i][j] = sc.nextInt();
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("your matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < coloumns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("sum of all elements of matrix= " + sum);
        sc.close(); 
    }
}
