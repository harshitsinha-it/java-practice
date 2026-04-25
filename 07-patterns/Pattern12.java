public class Pattern12 {
    public static void main(String[] args){
        System.out.println("Number triangle: ");
        for (int i = 1; i <= 5; i++){
            //space
            for (int j = 1; j <= 5-i; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j+ " ");
                continue;
            }
            if (i != 1){
                for (int j = 2; j <= i; j++){
                    System.out.print(j+ " ");
                }
            } 
            System.out.println();
        }
    }
}
