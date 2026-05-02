public class CompareTwoStrings {
    public static void main(String[] args){
        String name1 = "Tony";
        String name2 = "Tony";

        //Case1: if S1 > S2 -> +ve value
        //Case2: if S1 == S2 -> 0
        //Case3: if S1 < S2 -> -ve value
        if (name1.compareTo(name2) == 0){
        //name1 == name2 -> we not use this method bcz in some case it not work correctly     
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
