public class ArrayDemo {
    public static void main(String[] args){
        //int[] marks = new int[3];
        int[] marks = {89, 78, 99};
        //marks[0] = 89;
        //marks[1] = 97;
        //marks[2] = 98;
        for (int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Length of my array= " + marks.length);
    }
}
