import java.util.*;
public class NumberSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of your array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array values: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int x = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < size; i++){
            if (x == arr[i]){
                System.out.println("Found at index : " + i);
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
