import java.util.*;
public class NumberPower {
    public static double power(int x, int n){
        return Math.pow(x, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of base: ");
        int x = sc.nextInt();
        System.out.print("Enter value of exponent: ");
        int n = sc.nextInt();
        System.out.println("Final value of " + x + "^" + n + "= " + power(x,n));
        sc.close();
    }
}
