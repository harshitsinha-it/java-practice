import java.util.*;
public class TwoD_ArraySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("coloumns: ");
        int coloumns = sc.nextInt();
        int[][] matrix = new int[rows][coloumns];
        System.out.println("Enter elements: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < coloumns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter a number to search: ");
        int x = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < coloumns; j++){
                if (x == matrix[i][j]){
                    System.out.println("Found at index: " + (i) + ", " + (j));
                    flag = 1;
                }
            }
        }
        if (flag == 0){
            System.out.print("Element not found");
        }
        sc.close(); 
    }
}
