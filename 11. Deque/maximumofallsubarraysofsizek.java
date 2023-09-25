import java.util.ArrayDeque;

public class maximumofallsubarraysofsizek {
    void printkMax(int arr[], int k){
    int n=arr.length;
    ArrayDeque<Integer>dq=new ArrayDeque<Integer>();
    for(int i=0; i<k; i++){
        while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            dq.removeLast();
        dq.addLast(i);
    }
    for(int i=k; i<n; i++){
        System.out.println(arr[dq.peek()] + " ");
        while(!dq.isEmpty() && dq.peek()<=i-k){
            dq.removeFirst();
        }
        while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            dq.removeLast();
        dq.addLast(i);
    }
    System.out.println(arr[dq.peek()] + " ");
}
public static void main(String[] args) {
    maximumofallsubarraysofsizek maxFinder = new maximumofallsubarraysofsizek();
    int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    maxFinder.printkMax(arr, k);
}
}