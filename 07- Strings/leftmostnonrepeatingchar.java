import java.util.Arrays;

public class leftmostnonrepeatingchar {
    
    static final int CHAR=256;
    static int nonRep(String s){
      int fi [] = new int[CHAR];
      Arrays.fill(fi, -1);
      for(int i=0; i<s.length(); i++){
        if(fi[s.charAt(i)] == -1)
            fi[s.charAt(i)] = i;
        else
            fi[s.charAt(i)] = -2;
      } 
      int res = Integer.MAX_VALUE;
      for(int i=0; i<CHAR; i++)
        if(fi[i]>=0)
            res=Math.min(res, fi[i]);
    
    return (res==Integer.MAX_VALUE)?-1 : res;

}

    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(nonRep(s));
    }
}

//TIME=THETA(n)
// SPACE= THETA(CHAR)