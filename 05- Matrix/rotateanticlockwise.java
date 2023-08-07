// matri -> transpose -> reverse columns

public class rotateanticlockwise {
    static void antClockwise(int arr[][]){
        int n =arr.length;
        int [][] temp = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                temp[i][j] = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp[i][j];
            }
        }

        for(int i=0; i<n;i++)
        {
            int low=0;
            int high=n-1;
            while(low<high){
                temp[low][high]=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp[low][high];

                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
       int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        antClockwise(arr);

        for(int i =0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//TIME = THETA(n^2)
//Aux Space = O(1)