public class maxlengthevenoddsubarray {
    static int maxEvenOdd(int arr[], int n){
        int res=1;
        int curr =1;
        for(int i =1; i<n; i++){
            if((arr[i]%2 ==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
            {
                curr++;
                res=Math.max(curr, res);
            }
            else {
                curr =1;}
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,10, 20, 6, 3, 8};
        int x = maxEvenOdd(arr, 6);
        System.out.println(x);
    }
}
//TIME = O(n)