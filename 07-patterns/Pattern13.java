public class Pattern13 {
    public static void main(String[] args){
        System.out.println("Star merge triangle: ");
        int n = 4;
        for (int i = 1; i <= n; i++){
            //space
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //half tringle
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //another half triangle
                for (int j = 1; j < i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
        //for lower part
        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            //lower half tringle
            for (int j = i; j <= n; j++){
                System.out.print("*");
            }
            //for another lower half triangle
            for (int j = n-i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
