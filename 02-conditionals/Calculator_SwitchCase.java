import java.util.*;
public class Calculator_SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("'1' for Addition");
        System.out.println("'2' for Substraction");
        System.out.println("'3' for Multipliction");
        System.out.println("'4' for Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1: System.out.println("Addition= " + (a + b));
            break;
            case 2: System.out.println("Substraction= " + ( a - b));
            break;
            case 3: System.out.println("Multiplication= " + ( a * b));
            break;
            case 4: if (b != 0){
                System.out.println("Division= " + (a / b));
            }
            else{
                System.out.println("Cannot divide by zero");
            }
            break;
            default: System.out.println("Invalid choice");
        }
        sc.close();
    }
}
