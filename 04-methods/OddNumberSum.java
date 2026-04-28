import java.util.*;
public class OddNumberSum {
    public static int oddSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i += 2){
                sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of odd number till " + n +" = " +oddSum(n));
        sc.close();
    }
}
