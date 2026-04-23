import java.util.*;
public class IfElseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.print("Person can vote");
        }
        else{
            System.out.print("Person can not vote");
        }
        sc.close();
    }
}
