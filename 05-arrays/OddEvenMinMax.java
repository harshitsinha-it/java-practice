import java.util.Scanner;

public class OddEvenMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int min_odd = Integer.MAX_VALUE;
        int max_even = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++){
            if (arr[i] % 2 != 0 && arr[i] < min_odd){
                min_odd = arr[i];
            }
            if (arr[i] % 2 == 0 && arr[i] > max_even){
                max_even = arr[i];
            }
        }
        if (min_odd == Integer.MAX_VALUE){
            System.out.println("No odd number found");
        }
        else{
            System.out.println("Min odd = " + min_odd);
        }
        if (max_even == Integer.MIN_VALUE){
            System.out.println("No even number found");
        }
        else{
            System.out.println("Max even = " + max_even);
        }
        sc.close();
    }
}
