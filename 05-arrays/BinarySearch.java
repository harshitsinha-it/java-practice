public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14};
        int x = 10;
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (arr[mid] == x){
                index = mid;
                break;
            }
            else if (arr[mid] < x){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if (index != -1){
            System.out.println("Found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
