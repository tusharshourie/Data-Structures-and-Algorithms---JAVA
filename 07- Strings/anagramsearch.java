//check if pattern is present or permutation of string is present
//the characters should be continuos and can be permutations
// ANAGRAM

public class anagramsearch {
    static final int CHAR = 256; 
    
    static boolean areSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < CHAR; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isPresent(String txt, String pat){
        if (txt.length() < pat.length()) {
            return false;
        }

        int []CT=new int[CHAR];
        int []CP = new int[CHAR];
        
        for(int i=0; i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        
        for(int i=pat.length(); i<txt.length(); i++){
            if(areSame(CP,CT))
                return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }

        if (areSame(CP, CT)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
       String txt = "BACDGABCDA";
        String pat = "ABCD";

        if (isPresent(txt, pat)) {
            System.out.println("Anagram pattern found.");
        } else {
            System.out.println("Anagram pattern not found.");
        }
    }
}

// TIME=O(n*CHAR)
//SPACE=THETA(CHAR)