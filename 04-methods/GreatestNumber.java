import java.util.*;
public class GreatestNumber {
    public static void compare(int a, int b){
        if (a > b){
            System.out.println(a + " is greater than " + b);
        }
        else if (b > a){
            System.out.println(b + " is greater than " + a);
        }
        else{
            System.out.println("Both are equal");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        compare(a,b);
        sc.close();
    }
}
