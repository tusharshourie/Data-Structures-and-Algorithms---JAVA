import java.util.*;
// import java.util.Arrays;
public class countdistinctelement {
    static int countDistinct(int arr[]){
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++)
        s.add(arr[i]);  
        return s.size();


        //IMPROVED

        // HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        // return s.size();
    }
    public static void main(String[] args) {
        int arr[] ={10,20,10,30,20};
        System.out.print(countDistinct(arr));
    }
}
// TIME = THETA(n)
//SPACE= O(n)