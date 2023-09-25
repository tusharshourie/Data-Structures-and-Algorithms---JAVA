import java.util.Arrays;
public class longestsubstringwithdistinctchars {
    static int longestDist(String str) {
        int n = str.length();
        int res = 0;
        int prev[] = new int[256];

        Arrays.fill(prev, -1);  
        int i = 0;  
        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[str.charAt(j)]);
            int maxEnd = j - i + 1;
            res = Math.max(res, maxEnd);  
            prev[str.charAt(j)] = j;
        }
        return res;  
    }

    public static void main(String[] args) {
        String str = "abcadbd";
        System.out.println("Longest substring with distinct characters: " + longestDist(str));
    }
}
