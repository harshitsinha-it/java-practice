public class StringBuilderModify {
    public static void main(String[] args){ 
        StringBuilder sb = new StringBuilder ("Tony");

        //To insert something 
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(3, 'n');
        System.out.println(sb);

        //To delete something
        sb.delete(0, 1);
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
    }
}
