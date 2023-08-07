import java.util.*;
public class pairwithgivensum {
    static boolean isPair(int arr[], int n, int sum){
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            if(s.contains(sum-arr[i]))
                return true;
            
                s.add(arr[i]);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {3,2,8,15,-8};
        int n= arr.length;
        int sum = 17;
        boolean HasPair = isPair(arr, n, sum);
        System.out.print(HasPair);
    }
}
//Time = O(n)
//space= O(n)