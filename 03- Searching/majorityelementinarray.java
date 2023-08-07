//majority element = element that appears more than n/2 times

//count the occurence of element and return index
public class majorityelementinarray {
    static int findMajority(int arr[],int n){
        int res =0, count =1;
        for(int i=1; i<n; i++){
            if(arr[res]==arr[i])
            count++;
            else 
            count--;

            if(count==0){
                res = i; count =1;
            }
        }
        count=0;
        for(int i=0; i<n; i++)
        { if(arr[res]==arr[i])
        count++;
        }
        if(count<=n/2)
        res=-1;

        return res;
    }
    public static void main(String[] args) {
        int arr[]={8,8,6,6,6,4,6};
        int n =arr.length;
        System.out.println(findMajority(arr, n));
    }
}

// this code returns the index of any of the occurence of the majority element
//time = O(n)