//anagrams = to check whether the two strings are permutations of each other or not
public class checkforanagram {
    static final int CHAR = 256;
    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        
        int count[]= new int[CHAR];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<CHAR; i++)
            if(count[i]!=0)
                return false;
        
        return true;

    }

    public static void main(String[] args) {
        String s1= "aabca";
        String s2="acaba";
        System.out.println(isAnagram(s1, s2));
    }
}
//TIME=O(n+CHAR)
//SPACE=O(CHAR)