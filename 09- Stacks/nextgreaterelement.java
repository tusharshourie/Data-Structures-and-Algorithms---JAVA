//greatest element next to it position wise

import java.util.Stack;

public class nextgreaterelement {
    static void nextgreat(int arr[], int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(stack.empty()==false && stack.peek()<=arr[i]){
                stack.pop();
            }
            int nexG=(stack.empty())?(-1):(stack.peek());
            System.out.println(nexG+" ");
            stack.push(arr[i]);
        }
    }
}
