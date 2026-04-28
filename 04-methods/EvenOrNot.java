import java.util.*;
public class EvenOrNot {
    public static void isEven(int n){
        if (n % 2 == 0){
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isEven(n);
        sc.close();
    }
}
