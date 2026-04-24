import java.util.*;
public class MenuDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int choice;
        do{
            System.out.println("1. Say Hello");
            System.out.println("2. Say byee");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1){
                System.out.println("Hello!");
            }
            else if (choice == 2){
                System.out.println("Byee!");
            }
            else if (choice == 0){
                System.out.println("Exit");
            }
            else{
                System.out.println("Invaild choice");
            }
        }while (choice != 0);
        sc.close();
    }
}
