public class largestelementinarray {
    static int getlargest(int arr[])
    {
        int res=0;
        for(int i=1; i<arr.length;i++)
            if(arr[i]>arr[res])
            res=i;
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5, 22, 80, 6};
        System.out.println("The largest element is stored at the index: "+ getlargest(arr));
    }
    
}
//TIME COMPLEXITY: Theta(n)
