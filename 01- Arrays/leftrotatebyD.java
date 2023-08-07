public class leftrotatebyD {

    static void leftRotate(int arr[], int d, int n){
        reversearr(arr, 0, d-1);
        reversearr(arr, d, n-1);
        reversearr(arr, 0, n-1);
    }

    static void reversearr(int arr[], int low, int high){
        while(low<high){
            int temp=arr[high];
            arr[high] =arr[low];
            arr[low]=temp;
            low++;
            high--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int n=5;
        int d=2;
        leftRotate(arr, d, n);
        System.out.println("Array after"+  d + " left rotations: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
//Time complexity = Theta(n)
//Auxilary Space = Theta(1)