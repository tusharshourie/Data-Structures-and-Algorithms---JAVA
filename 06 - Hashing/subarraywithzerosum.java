import java.util.*;
public class subarraywithzerosum {
    static boolean isPair(int arr[], int n){
        HashSet<Integer> h = new HashSet<>();
        int pre_sum=0;
        for(int i=0; i<n; i++){
            pre_sum+=arr[i];
            if(h.contains(pre_sum))
                return true;
            if(pre_sum==0)
                return true;
            h.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {4,-3,1,2};
        int n=arr.length;
        boolean hasPair = isPair(arr,n);
        System.out.print(hasPair);
    }
    
}
//Time= O(n)
//Space= O(n)