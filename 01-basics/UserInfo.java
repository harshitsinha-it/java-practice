import java.util.*;
public class UserInfo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("Enter your hobbies: ");
        String hobby = sc.nextLine();
        System.out.println("\n--- USER INFO ---");
        System.out.println("User Name= " +name);
        System.out.println("User Age= " +age);
        System.out.println("User City= " +city);
        System.out.println("User hobby= " +hobby);
        sc.close();
    }
}
