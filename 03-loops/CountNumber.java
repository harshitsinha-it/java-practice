import java.util.*;
public class CountNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int positive = 0, negative = 0, zero = 0;
        int n;
        char choice;
        do{
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if (n > 0){
                positive++;
            }
            else if (n < 0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.print("Do you want tp continue? (y/n): ");
            choice = sc.next().charAt(0);
        }while (choice == 'Y' || choice == 'y');
        System.out.println("Result: ");
        System.out.println("Positive: " +positive);
        System.out.println("Negative: " +negative);
        System.out.println("Zero: " +zero);
        sc.close();
    }
}
