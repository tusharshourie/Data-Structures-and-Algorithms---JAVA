/*given an array of non negative integer, no of elements = no of bars
and the element represents the height of the bar
difference between two bars = amount of water stored/trapped
if array is in increasing or decreasing order then we can collect 0 water*/

public class trappingrainwater {
    static int getwater(int arr[], int n){
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0]=arr[0];
        for(int i =1 ; i<n; i++)
            lmax[i]=Math.max(arr[i], lmax[i-1]);
        rmax[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--)
            rmax[i]=Math.max(arr[i], rmax[i+1]);
        for(int i =1; i<n-1; i++)
            res=res+(Math.min(lmax[i], rmax[i]) - arr[i]);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5, 0, 6, 2, 3};
        int n=5;
        System.out.println(getwater(arr, n));
    }
}
//TIME COMPLEXITY = Theta(n)