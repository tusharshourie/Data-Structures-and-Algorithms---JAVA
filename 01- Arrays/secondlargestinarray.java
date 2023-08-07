public class secondlargestinarray {
    static int secondlargest(int arr[]){
        int n = arr.length;
        int res=-1;
        int largest=0;
        for(int i =0; i<n; i++){
            if(arr[i]>arr[largest])
            {
            res=largest;
            largest=i;
            }
        else if(arr[i]!=arr[largest])
        {
            if(res==-1||arr[i]>arr[res])
            res = i;
        }
    }
    return res;
}
    public static void main(String[] args) {
        int arr[] = {5, 22, 80, 22, 6};
        System.out.println("The second largest element is stored at the index: "+ secondlargest(arr));
    }
    
}
//returns -1 if all the elements are same in array or else returns the index of 2nd largest
//Time complexity = Theta(n)
//Auxiliary Space = Theta(1)