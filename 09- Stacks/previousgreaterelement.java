//closest greater element on left , if no greater then -1

import java.util.Stack;

public class previousgreaterelement {
    static void printGreater(int arr[], int n){
        Stack<Integer> stack = new Stack<>();       
         stack.push(arr[0]);
         System.out.print(-1+" ");
         for(int i=1;i<n;i++){
            while(stack.isEmpty()==false && stack.peek()<=arr[i])
                stack.pop();
            int pg=(stack.empty())?-1:stack.peek();
            System.out.print(pg+" ");
            stack.push(arr[i]);
         }
    }
}
