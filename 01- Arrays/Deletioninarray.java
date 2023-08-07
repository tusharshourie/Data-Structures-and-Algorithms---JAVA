public class Deletioninarray {
    static int deleteEl(int arr[], int n, int x){
        int i=0;
        for(i=0; i<n; i++){
            if(arr[i]==x)
            break;
        }
        if(i==n)
        return n;

        for(int j=i; j<n-1; j++) 
        {
            arr[j] = arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[]={4, 6, 11, 2, 74}, x=11, n=5;

        System.out.println("BEFORE DELETION: ");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        n=deleteEl(arr, n, x);
        System.out.println("AFTER DELETION: ");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}

//TIME COMPLEXITY: Theta(n)