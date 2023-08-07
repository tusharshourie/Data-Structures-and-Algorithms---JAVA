public class leftrotateby1 {
    static void rotateleft(int arr[]){
        int n = arr.length;
        int temp =arr[0];
        for(int i =1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        rotateleft(arr);
        System.out.println("Array after left rotation by 1 is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
//TIME COMPLEXITY = Theta(n)
//Auxilary space = Theta(1)