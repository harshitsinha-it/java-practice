import java.util.*;
public class Calculator_IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter your choice: ");
        System.out.println("'1' for addition");
        System.out.println("'2' for Substraction");
        System.out.println("'3' for multiplication");
        System.out.println("'4' for division");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("sum= " +(a+b));
        }
        else if (choice == 2){
            System.out.println("substraction= " +(a-b));
        }
        else if (choice == 3){
            System.out.println("multiplication= " +(a*b));
        }
        else if (choice == 4){
            if (b != 0){
                System.out.println("division= " +(a/b));
            }
            else{
                System.out.println("cannot divide by zero");
            }
        }
        else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
