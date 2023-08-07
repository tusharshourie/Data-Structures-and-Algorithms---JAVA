//count distinct common elements
import java.util.HashSet;

public class intersectionofunsortedarrays {
    static int intersection(int a[], int b[]) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        
        int res = 0;
        for (int j = 0; j < b.length; j++) {
            if (s.contains(b[j])) {
                res++;
                s.remove(b[j]);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int commonElements = intersection(arr1, arr2);
        System.out.println("Number of common elements: " + commonElements);
    }
}
//time = O(m+n)
//space = O(m)