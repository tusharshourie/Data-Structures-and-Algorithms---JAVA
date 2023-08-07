import java.util.*;
public class subarraywithgivensum {
    static boolean isSum(int arr[], int n, int sum){
        HashSet<Integer> s =new HashSet<Integer>();
        int pre_sum=0;
        for(int i=0; i<n; i++){
            if(pre_sum == sum)
                return true;
            if(s.contains(pre_sum-sum))
                return true;
            s.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,8,6,13,3,-1};
        int sum=22;
        int n = arr.length;
        boolean hasSum= isSum(arr, n, sum);
        System.out.print(hasSum);
    }
}
//Time=O(n)
//Space=O(n)