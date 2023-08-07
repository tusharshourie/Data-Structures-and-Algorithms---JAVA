public class matrixboundarytraversal {
    static void boundTraversal(int arr[][]){
        int rows= arr.length;
        int columns = arr[0].length;
        if(rows==1){
            for(int i=0; i<columns; i++)
                System.out.print(arr[0][i] + " ");
        }
        else if(columns==1){
            for(int i =0; i<rows; i++)
                System.out.print(arr[1][0] + " ");
        }
        else{
            for(int i=0; i<columns; i++)
                System.out.print(arr[0][i] + " ");
            for(int i=1; i<rows; i++)
                System.out.print(arr[i][columns-1] + " ");
            for(int i=columns-2; i>=0 ; i--)
                System.out.print(arr[rows-1][i] + " ");
            for(int i=rows-2; i>=0; i--)
                System.out.print(arr[i][0] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        boundTraversal(arr);
    }
}
