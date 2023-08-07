/* I/P : 1 2 3 4
 *       5 6 7 8
 *       9 10 11 12
 *       13 14 15 16
 * O/P= 1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13
 */

public class matrixinsnakepattern {
    public static void snakePrint(int arr[][]){
        int rows= arr.length;
        int columns = arr[0].length;
        for(int i =0; i<rows; i++){
                if(i%2==0){
                    for(int j=0; j<columns; j++)
                        System.out.print(arr[i][j] + " ");

                }
                else{
                    for(int j =columns-1; j>=0; j--)
                        System.out.print(arr[i][j] + " ");
                }
            }
        }

        public static void main(String[] args) {
            int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
            snakePrint(arr);
        }
    }

