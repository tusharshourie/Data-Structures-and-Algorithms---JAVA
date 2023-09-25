//subsequence obtained by removing 0 or more characters from a string
//characters which are left should appear in the same order as the string
//subsequence is not contiguous

public class stringSubsequence {
    static boolean isSub(String s1, String s2, int n, int m){
        //  RECURSIVE SOLUTION

        // if(m==0)
        //     return true;
        // if(n==0)
        //     return false;

        // if(s1.charAt(n-1) == s2.charAt(m-1))
        //     return isSub(s1, s2, n-1, m-1);
        // else 
        //     return isSub(s1, s2, n-1, m);


        //ITERATIVE SOLUTION
        int j=0;
        for(int i=0; i<n && j<m; i++)
        {    if(s1.charAt(i) == s2.charAt(j))
                j++;
        }
        return (j==m);
    }

    public static void main(String[] args) {
        String s1="ABC";
        String s2="AC";
        int n= s1.length();
        int m=s2.length();
       System.out.println(isSub(s1, s2, n, m));
    }
}
