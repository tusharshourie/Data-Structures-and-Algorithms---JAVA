public class checkifstringsarerotations {
    static boolean areRotations(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return ((s1+s2).contains(s2));
    }
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defabc";

        if (areRotations(s1, s2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }
}
//TIME=O(N)