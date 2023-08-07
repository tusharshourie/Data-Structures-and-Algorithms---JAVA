public class removeduplicates {
    static int remDups(int arr[])
    {
        int n =arr.length;
        int res=1;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] ={10, 20, 20, 20, 30, 30, 50};
        int x = remDups(arr);
        System.out.println("The number of distinct elements in the array are: " + x);
    }
    
}
//TIME COMPLEXITY= O(n)
//Auxilary space = O(1)