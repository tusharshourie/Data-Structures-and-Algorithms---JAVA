//pritn elements that occur more than n/k times
import java.util.HashMap;
import java.util.Map;

public class morethann_koccurences {
    static void printNByK(int arr[], int n, int k){
        HashMap<Integer, Integer>hM = new HashMap<Integer, Integer>();
        for(int x: arr)
            hM.put(x, hM.getOrDefault(x, 0)+1);
        for(Map.Entry<Integer, Integer>e:hM.entrySet()){
            if(e.getValue()>n/k)
                System.out.print(e.getKey() + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={10,10,20,30,20,10,10};
        int n=arr.length;
        int k=2;
        printNByK(arr, n, k);
    }
}
//TIME=Theta(n)