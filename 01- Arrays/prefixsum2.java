/* Given n range, find the maximum appearing
 * element in these ranges */
public class prefixsum2 {
    static int maxOccur(int L[], int R[], int n) {
        int[] arr = new int[1000];
        
        for (int i = 0; i < n; i++) {
            arr[L[i]]++;
            arr[R[i] + 1]--;
        }
        
        int maxm = arr[0];
        int res = 0;
        
        for (int i = 1; i < 1000; i++) {
            arr[i] += arr[i - 1];
            
            if (maxm < arr[i]) {
                maxm = arr[i];
                res = i;
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int[] L = {1, 3, 2};
        int[] R = {5, 7, 3};
        int n = 3;
        
        int maxAppear = maxOccur(L, R, n);
        
        System.out.println("Max appearing element: " + maxAppear);
    }
}
