public class SubString {
    public static void main(String[] args){
        String sentance = "My name is Tony";
        //SubString -> (beging index, end index)
        String name = sentance.substring(11, sentance.length());
        System.out.println(name);

        String name2 = sentance.substring(11); // by default it take last index if ntg mentioned
        System.out.println(name2);
    }
}
