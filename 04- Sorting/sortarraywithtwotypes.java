// Segregate positive and negative
// OR Segregate even and odd
// OR Segregate a binary array

public class sortarraywithtwotypes{
    static void segPosNeg(int arr[], int n){
        int i =-1;
        int j =n;
        while(true){
            do{ i++;} while(arr[i]<0);
            do{ j--; } while(arr[j]>0);
            if(i>=j)
            return;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {-12, 18, -10, 15};
        int n = arr.length;
        segPosNeg(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//Time = Theta(n)
// Aux Space = Theta(1)