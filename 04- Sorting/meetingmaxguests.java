// given two arrays one for arrival time of guests and another for departure
// give the max number of guests you can meet at most

import java.util.*;

public class meetingmaxguests {
    static int maxGuest(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1, j=0, res=1, curr=1; //i=1 second arrival and res =1 first departure
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                curr++; 
                i++;
            }
            else{
                curr--;
                j++;
            }
            res=Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {900, 600, 700};
        int dep[] = {1000, 800,730};
        int n=arr.length;
        System.out.println(maxGuest(arr, dep, n));
    }
}
//TIME = O(nlogn)
//