/*
 * ASSUMPTIONS: 
 *  ODD SIZED MATRIX
 * ALL DISTINCT VALUES
 */
import java.util.Arrays;

public class medianofrowwisesortedmatrix {
    static int matMedian(int mat[][], int r, int c) {
        int min = mat[0][0], max = mat[0][c - 1];

        for (int i = 1; i < r; i++) {
            if (mat[i][0] < min) {
                min = mat[i][0];
            }
            if (mat[i][c - 1] > max) {
                max = mat[i][c - 1];
            }
        }

        int medPos = (r * c + 1) / 2;

        while (min < max) {
            int mid = (min + max) / 2;
            int midPos = 0;

            for (int i = 0; i < r; i++) {
                int pos = Arrays.binarySearch(mat[i], mid);
                if (pos < 0) {
                    pos = Math.abs(pos) - 1;
                } else {
                    while (pos < c && mat[i][pos] == mid) {
                        pos++;
                    }
                }
                midPos += pos;
            }

            if (midPos < medPos)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }

    public static void main(String[] args) {
        int r = 3;
        int c = 5; 

        int mat[][] = { { 5, 10, 20, 30, 40 }, { 1, 2, 3, 4, 6 }, { 11, 13, 15, 17, 19 } };

        int median = matMedian(mat, r, c);
        System.out.println("Median: " + median);
    }
}



//TIME = O(r*log(max-min)*log c)