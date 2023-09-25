// efficient solution:
// span = index of curremt element-index of closest greater element on left     ** if there is a greater element on left
// span = index of current element+1   **otherwise when no greater element is on left

import java.util.Stack;

public class stockspan {
    static void printSpan(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.println(1);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            int span = stack.isEmpty() ? i + 1 : i - stack.peek();
            System.out.println(span);
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 60,10,20,15,35,50};
        int n = arr.length;
        printSpan(arr, n);
    }
}

//time=theta(n)
//space= O(n)