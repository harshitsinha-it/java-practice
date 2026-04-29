import java.util.*;
public class CircleCalculation {
    public static double circumference(double r){
        return 2 * 3.14 * r;
    }
    public static double area(double r){
        return 3.14 * r * r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.print("What you want to calculate type: \n('a' or 'A' for area / 'c' or 'C' for circumference)- ");
        char choice = sc.next().charAt(0);
        if (choice == 'c' || choice == 'C'){
            System.out.println("Circumference= " + circumference(r));
        }
        else if (choice == 'a' || choice == 'A'){
            System.out.println("Area of circle= " + area(r));
        }
        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    } 
}
