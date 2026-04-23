import java.util.*;
public class Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        if (a > b){
            System.out.print("a is greater");
        }
        else if (a < b){
            System.out.print("a is lesser");
        }
        else{
            System.out.print("Both are equal");
        }
        sc.close();
    }
}
