import java.util.*;
public class AvgNumber {
    public static double average(int a, int b, int c){
        return (a + b + c) / 3.0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.println("Average of 3 numbers= " + average(a,b,c));
        sc.close();
    }
}
