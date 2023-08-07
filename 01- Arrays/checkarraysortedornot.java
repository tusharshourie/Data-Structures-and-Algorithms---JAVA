public class checkarraysortedornot {
    static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++)
            if(arr[i]<arr[i-1])
            return false;
        return true;
            }
    public static void main(String[] args) {
    int arr[] = {12, 3, 45, 92, 11, 13};
    System.out.println(isSorted(arr));    
    }
    
}
//TIME COMPLEXITY= O(n)
//Auxiliary space = constant