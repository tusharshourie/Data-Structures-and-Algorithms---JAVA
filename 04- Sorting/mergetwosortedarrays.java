public class mergetwosortedarrays {
    static void mergeArray(int a[], int b[], int m, int n){
        int i =0, j=0;
        while(i<m&&j<n){
            if(a[i]<=b[j]){
                System.out.print(a[i] + " ");
                i++;
            }
            else{
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while(i<m){
            System.out.print(a[i]+ " ");
            i++;
        }
        while(j<n){
            System.out.print(b[j] + " ");
            j++;
        }
    }
    
    public static void main(String[] args) {
        int a[] = {10,20,50};
        int b[] = {5,50,50};
        int m = a.length;
        int n = b.length;
        mergeArray(a, b, m, n);
    }
}

//TIME = THETA(m+n)
// aux space = O(1)