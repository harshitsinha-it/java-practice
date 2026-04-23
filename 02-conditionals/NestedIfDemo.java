import java.util.*;
public class NestedIfDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are u a citizen? (true/false): ");
        boolean iscitizen = sc.nextBoolean();
        if (age >= 18){
            if (iscitizen){
                System.out.print("Person can vote");
            }
            else{
                System.out.print("Not eligible for vote (as not a citizen)");
            }
        }
        else {
            System.out.print("Not eligible for vote, (Under age)");
        }
        sc.close();
    }
}
