import java.util.*;
public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of your array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array values are : ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
