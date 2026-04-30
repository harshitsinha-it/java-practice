public class ArraySum {
    public static void main(String[] args){
        int[] arr = {8, 3, 6, 2, 9, 7, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of your array values= " + sum);
    }
}
