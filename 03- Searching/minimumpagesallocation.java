/*GIVEN A SET OF BOOKS WITH A NO. OF PAGES AND A NO OF STUDENTS
 * WE NEED TO MAKE SURE THAT BOOKS ARE ASSIGNED TO THE STUDENTS IN
 * SUCH A WAY THAT THE MAX NO OF PAGES READ BY A STUDENT IS MINIMIZED
  */
// MINIMIZE THE MAX PAGES ALLOCATED
// ONLY CONTIGUOUS PAGES CAN BE ALLOCATED
//STUDENT MUST FINISH THE BOOK COMPLETELY

public class minimumpagesallocation {
     static int minPages(int arr[], int k){
        int n = arr.length;
        int sum=0;
        int mx=0;
        for(int i =0; i<n; i++){
            sum+=arr[i];
            mx=Math.max(mx, arr[i]);
        }
        int low = mx, high = sum, res=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isfeasible(arr, n , k, mid))
            {
                res = mid;
                high =mid-1;
            }
            else
            low = mid+1;
        }
        return res;
     }

     static boolean isfeasible(int arr[], int n, int k, int ans){
        int req=1,sum=0;
        for(int i =0; i<n; i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }
            else 
            sum += arr[i];
        }
        return (req <=k);
     }

     public static void main(String[] args) {
        int arr[] = {10,5,20};
        int k=2;
        System.out.println(minPages(arr, k));
     }
}
//time = O(n*log(sum-mx))  or O(n*log sum)