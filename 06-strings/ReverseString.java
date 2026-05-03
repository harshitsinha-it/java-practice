import java.util.*;
public class ReverseString {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sentance: ");
        String sentance = sc.nextLine();
        System.out.println("Reverse of it is: ");
        for (int i = sentance.length() - 1; i >= 0; i--){
            System.out.print(sentance.charAt(i));
        }
        sc.close();
    }
    
}
