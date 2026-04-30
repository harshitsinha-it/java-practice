import java.util.*;
public class FibonacciSeries {
    public static void fibo(int n){
        int f1 = 0;
        int f2 = 1;
        int f3;
        for (int i = 1; i <= n; i++){
            System.out.println(f1);
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of terms you wants: ");
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }
}
