import java.util.*;
public class VoteOrNot {
    public static void checkAge(int age){
        if (age >= 18){
            System.out.println("Person can vote");
        }
        else{
            System.out.println("Person can not vote (underage)");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        checkAge(age);
        sc.close();
    }
}
