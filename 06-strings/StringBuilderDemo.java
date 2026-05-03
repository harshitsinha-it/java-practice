public class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        //To change something:-
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
