import java.util.*;
public class MultiplicationNum {
    public static int multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Multiplication = " + multiply(a,b));
        sc.close();
    }
}
