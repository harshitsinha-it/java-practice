import java.util.*;
public class StringLength {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " +name);
        System.out.println("Length = " + name.length());
        sc.close();
    }
}
