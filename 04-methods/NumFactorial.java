import java.util.*;
public class NumFactorial {
    public static int factorial(int a){
        int n = 1;
        for (int i = 2; i <= a; i++){
            n = n * i;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int fact = factorial(a);
        System.out.println("Factorial of " + a + " = " + fact);
        sc.close();
    }
}
