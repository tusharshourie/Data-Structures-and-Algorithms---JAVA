public class maxconsecutive1s{
    static int maxcon(int arr[]){
        int res=0;
        int curr=0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] == 0)
            curr=0;
            else
            {
                curr++;
                res=Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
         int arr[] = {0, 1, 1, 1, 1 ,1};
        int x = maxcon(arr);
        System.out.println(x);
    }
}
//TIME = O(n)
//Aux Space = O(1)