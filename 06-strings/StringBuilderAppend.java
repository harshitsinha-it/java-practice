public class StringBuilderAppend {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("h");
        //Append:- To add something in end
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
