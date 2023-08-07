public class searchinrowwiseandcolwisesortedmat {
    static void searchMat(int matrix[][], int R, int C,int x){
        int i=0, j=C-1;
        while(i<R && j>=0){
            if(matrix[i][j]==x){
                System.out.print("Fount at (" + i + "," + j + ")" );
                break;
            }
            else if(matrix[i][j]>x)
                j--;
            else
                j++;
        }
        if (i == R || j == -1)
        System.out.println("NOT FOUND");
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int R = matrix.length;
        int C=matrix[0].length;
        int x=29;


        searchMat(matrix, R, C, x);
    }
}
