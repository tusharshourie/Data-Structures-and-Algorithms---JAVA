public class movezeroestoend {
    static void movezeroes(int arr[]){
        int n = arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={8, 5, 6, 0, 0, 2, 0 , 9};
        movezeroes(arr);
        System.out.println("The new array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }    
    } 
}
//TIME COMPLEXITY= O(n)
//Auxilary space=O(1)
