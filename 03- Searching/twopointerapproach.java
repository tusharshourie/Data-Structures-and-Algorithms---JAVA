//Given a sorted array and a number x, we need to find if there is a pair in the array with sum = x 

public class twopointerapproach {
    static Boolean isPair(int arr[], int n, int x){
        int left =0, right = n-1;
        while(left<right){
            if(arr[left]+arr[right]==x)
            return true;
            else if (arr[left]+arr[right]>x)
            right--;
            else
            left++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,9,11,12,20,30};
        int n = arr.length;
        int x = 23;
        System.out.println(isPair(arr, n, x));
    }
}
//time = O(n)
//aux space = O(1)