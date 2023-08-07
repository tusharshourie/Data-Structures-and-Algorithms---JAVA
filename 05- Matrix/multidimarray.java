public class multidimarray{
    public static void main(String[] args) {
    int arr[][]= {{1,2,3},
                    {4,5,6}}; 
        //ANOTHER METHOD
    // int m =3, n=2;
    // int [][] arr = new int[m][n];

    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}