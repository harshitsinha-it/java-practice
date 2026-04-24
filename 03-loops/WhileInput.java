import java.util.*;
public class WhileInput {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num = 1;
        while (num != 0){
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();
        }
        System.out.println("loop ended");
        sc.close();
    }
}
