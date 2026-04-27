import java.util.*;
public class MethodDemo {
    public static void PrintName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        PrintName(name); //function call
        PrintName(name);
        sc.close();
    }
}
