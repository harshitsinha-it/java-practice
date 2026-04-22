import java.util.*;
public class CalculationDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        System.out.println("Sum = " +sum);
        System.out.println("Difference = " +diff);
        System.out.println("Multiplication = " +mul);
        sc.close();
    }
}
