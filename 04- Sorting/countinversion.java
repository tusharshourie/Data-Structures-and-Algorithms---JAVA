//A pair (arr[i], arr[j]) forms an inversion when i<j 
// and arr[i]>arr[j]

public class countinversion {
    
    static int countAndMerge(int arr[], int l, int m, int r){
        int n1= m-l+1;
        int n2 = r-m;
        int [] left=new int [n1];
        int [] right = new int[n2];
        for(int i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++){
            right[i]=arr[m+1+i];
        }
        int res=0, i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]) {
                arr[k] = left[i]; 
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
                res=res+(n1-i);
                
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,8,11,3,6,9,13};
        int l = 0;
        int r = 7;
        int m = (l +(r-l))/2;
        System.out.println(countAndMerge(arr, l, m, r));
        
    }
}
//Time complexity = O(nlogn)
//space = O(n)