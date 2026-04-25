public class Pattern13 {
    public static void main(String[] args){
        System.out.println("Star merge triangle: ");
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4-i; j++){
                //space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            if (i != 1){
                for (int j = 2; j <= i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
