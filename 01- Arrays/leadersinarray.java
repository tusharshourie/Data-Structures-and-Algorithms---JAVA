//leader = no element on the right of it is greater than it.
public class leadersinarray {
    static void leader(int arr[], int n){
        int curr_ldr=arr[n-1];
        System.out.println(curr_ldr);
        for(int i=n-2; i>=0; i--){
            if(curr_ldr < arr[i]){
                curr_ldr=arr[i];
                System.out.println(curr_ldr);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2};
        int n=arr.length;
        leader(arr, n);
    }
}
//it prints leaders from right to left
//TIME COMPLEXITY = Theta(n)