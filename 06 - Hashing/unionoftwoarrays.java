import java.util.*;
public class unionoftwoarrays {
    static int union(int a[], int b[])
{
    HashSet<Integer>s=new HashSet<Integer>();
    for(int i=0; i<a.length;i++)
        s.add(a[i]);
    for(int j=0; j<b.length;j++)
        s.add(b[j]);

    return s.size();
}

public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {4, 5, 6, 7, 8};
    int distinctElements = union(arr1, arr2);
    System.out.println("Number of distinct elements: " + distinctElements);
}
}
//TIME= O(m+n)
//Space=O(m+n)