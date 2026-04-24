import java.util.*;
public class PrimeLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < n/2; i++){
            if (n % i == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Not a prime number");
        }
        else if (n <=1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        
        }
        sc.close();
    }
}
