public class MinElement {
    public static void main(String[] args){
        int[] arr={34, 12, 98, 67, 45, 12, 89, 16};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Lowest value of array is: " + min);
    }    
}
