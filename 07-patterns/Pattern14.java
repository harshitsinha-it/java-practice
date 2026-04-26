public class Pattern14 {
    public static void main(String[] args){
        System.out.println("Butterfly pattern: ");
        int n = 4;
        for (int i = 1; i <= n; i++){
            //for upper half
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //for space
            for (int j = 1; j <= (n - i) * 2; j++){
                System.out.print("  ");
            }
            //for another uper half
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //for lower part same
        for (int i = n; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("* ");
            }
            for (int j = 1; j <= (n - i) * 2; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}