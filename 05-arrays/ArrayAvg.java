public class ArrayAvg {
    public static void main(String[] args){
        int[] arr = {45, 12, 67, 23, 90, 23};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of array values= " +avg);
    }
}
