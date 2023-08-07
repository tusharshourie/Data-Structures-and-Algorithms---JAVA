public class reversearray {
    static void reverse(int arr[]){
        int n = arr.length;
        int low=0;
        int high = n-1;
        while(low<high){
            int temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 3, 45, 92, 11, 13};
        reverse(arr);

        System.out.println("REVERSED ARRAY: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
//TIME COMPLEXITY= Theta(n)
//Auxilary space = Theta(1)