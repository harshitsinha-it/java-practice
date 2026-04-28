import java.util.*;
public class ParameterDemo {
    public static void printInfo(String name, int age){
        System.out.println("Name: " +name + ", Age: " + age);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        printInfo(name,age);
        sc.close();
    }
}
