import java.util.*;
public class GcdOf2Number {
    public static int gcd(int a, int b){
        int min = Math.min(a,b);
        for (int i = min; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st value: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Greatest common divisor of " + a + " and " + b + " is: " + gcd(a,b));
        sc.close();
    }
}
