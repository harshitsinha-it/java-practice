public class Pattern13 {
    public static void main(String[] args){
        System.out.println("Star merge triangle: ");
        for (int i = 1; i <= 4; i++){
            //space
            for (int j = 1; j <= 4-i; j++){
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
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            //lower half tringle
            for (int j = i; j <= 4; j++){
                System.out.print("*");
            }
            //for another lower half triangle
            for (int j = 4-i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
