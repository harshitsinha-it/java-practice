import java.util.*;
public class AddNumber {
    public static int SumNumber(int a, int b){
        int sum = a + b;
        System.out.println("Sum = " + sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        SumNumber(a,b);
        sc.close();
    } 
}
