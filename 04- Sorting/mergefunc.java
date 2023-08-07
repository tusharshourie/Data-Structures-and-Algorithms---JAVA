public class mergefunc {
    static void merge(int a[], int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high -mid;
        int [] left = new int[n1];
        int [] right = new int [n2];
        for(int i =0; i<n1; i++)
        {
            left[i]=a[low+i];
        }
        for(int i=0; i<n2; i++){
            right[i]=a[n1+i];
        }
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
                k++;
            }
            else{
                a[k]=right[j];
                j++;
                k++;
                
            }
        }
        while(i<n1){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=right[j]; 
            j++; 
            k++;
        }

    }

    public static void main(String[] args) {
        int a[] = {10,20,40, 5, 15};
        int low=0, high = a.length-1;
        int mid=2;
        merge(a, low, mid, high);
    }
    
}
//time = theta(n)
//aux space = theta(n)