import java.util.*;
public class StringDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Second name: ");
        String secondName = sc.nextLine();
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
        System.out.println("Length of string= " + fullName.length());

        //To print individual character of any strings:-
        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        sc.close();
    }
}
