class TwoStacks {
    int arr[];
    int cap, top1, top2;

    TwoStacks(int n) {
        cap = n;
        top1 = -1;
        top2 = cap;
        arr = new int[n];
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            throw new IllegalStateException("Stack 1 is empty");
        }
    }

    int pop2() {
        if (top2 < cap) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            throw new IllegalStateException("Stack 2 is empty");
        }
    }
}

public class twostacksinanarray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(10);
        ts.push2(20);
        ts.push2(30);
        System.out.println(ts.pop1());
        System.out.println(ts.pop2());
    }
}
