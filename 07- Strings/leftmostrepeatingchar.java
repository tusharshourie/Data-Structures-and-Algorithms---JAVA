//returns the index of leftmost occurring char

// import java.util.Arrays;

public class leftmostrepeatingchar {
    static final int CHAR=256;
    static int leftmost(String s){
        // int [] fIndex= new int[CHAR];
        // Arrays.fill(fIndex, -1);
        // int res= Integer.MAX_VALUE;
        // for(int i=0; i<s.length(); i++)
        // {
        //     int fi=fIndex[s.charAt(i)];
        //     if(fi==-1)
        //         fIndex[s.charAt(i)]=i;
        //     else
        //         res=Math.min(res, fi);
        // }
        // return (res==Integer.MAX_VALUE)?-1:res;

        boolean [] visited = new boolean[CHAR];
        int res=-1;
        for(int i=s.length()-1; i>=0; i--){
            if(visited[s.charAt(i)])
                res=i;
            else
                visited[s.charAt(i)] = true;
        }
        return res;
    }
    public static void main(String[] args) {
        String s="abccbd";
        System.out.println(leftmost(s));
    }
}
