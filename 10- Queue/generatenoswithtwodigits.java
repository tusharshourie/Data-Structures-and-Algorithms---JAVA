//Given a number n, print first n numbers(in increasing order) such that all
//these numbers have digits in set {5,6}
//eg: n=10 then
//oP= 5,6,55,56,65,66,555 and so on

import java.util.LinkedList;
import java.util.Queue;


public class generatenoswithtwodigits {
    static void printfirstN(int n){
        Queue<String> q = new LinkedList<>();
        q.offer("5");
        q.offer("6");

        for(int count=0; count<n; count++){
            String curr = q.peek();
            System.out.print(curr+" ");
            q.poll();
            q.offer(curr+"5" );
            q.offer(curr+"6" );
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printfirstN(n);
    }
}
