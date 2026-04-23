import java.util.*;
public class MarksDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if (marks > 100){
            System.out.print("Invalid marks");
        }
        else if(marks >= 90){
            System.out.print("Grade A");
        }
        else if(marks >= 75){
            System.out.print("Grade B");
        }
        else if(marks >= 50){
            System.out.print("Grade C");
        }
        else{
            System.out.print("Fail");
        }
        sc.close();
    }
}
