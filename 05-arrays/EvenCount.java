public class EvenCount {
    public static void main(String[] args){
        int[] arr = {45, 12, 67, 23, 90, 23};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count += 1;
            }
        }
        System.out.println("Even numbers present in array= " + count);
    }
}