import java.util.*;
public class MethodDemo {
    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        printName(name); //function call
        printName(name);
        sc.close();
    }
}
