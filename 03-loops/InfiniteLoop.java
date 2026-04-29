import java.util.*;
public class InfiniteLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n;
        do{
            System.out.print("Enter a number (0 for exit): ");
            n = sc.nextInt();
            System.out.println(n);
        }while (n != 0);
        System.out.println("Exit");
        sc.close();    
    }
}