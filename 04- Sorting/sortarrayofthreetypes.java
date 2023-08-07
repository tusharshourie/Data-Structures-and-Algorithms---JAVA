/* Sort an array of 0s, 1s and 2s
 * OR three way partitioning
 * OR Partition around a range
 */

 // DUTCH NATIONAL FLAG ALGORITHM
public class sortarrayofthreetypes {
    static void sort(int arr[], int n){
        int l=0, m=0, h =n-1;
        while(m<=h){
            if(arr[m]==0){
                int temp = arr[l];
                arr[l]=arr[m];
                arr[m]=temp;
                l++;
                m++;

            }
            else if(arr[m]==1){
                m++;
            }
            else{
                int temp = arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,1,1,2};
        int n = arr.length;
        sort(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
//time = Theta(n) 
// aux apce = Theta(1)