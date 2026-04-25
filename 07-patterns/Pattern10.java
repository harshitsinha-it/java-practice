public class Pattern10 {
    public static void main(String[] args){
        System.out.println("stars rhombus: ");
        for(int i=1; i<=5; i++) {
           //spaces
           for(int j=1; j<=5-i; j++) {
               System.out.print("  ");
           }


           //stars
           for(int j=1; j<=5; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }   
}
