public class transposematrix {
    static void transpose(int arr[][]) {
        int n = arr.length;
        int temp[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                temp[i][j] = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp[i][j];
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        transpose(arr);

        for(int i =0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
