import java.util.Arrays;

class Interval {
    int st, end;
    
    public Interval(int st, int end) {
        this.st = st;
        this.end = end;
    }
}

public class mergeoverlapintervals {
    
    static void mergeIntervals(Interval arr[], int n) {
        Arrays.sort(arr, (a, b) -> a.st - b.st);
        int res = 0;
        
        for (int i = 1; i < n; i++) {
            if (arr[res].end >= arr[i].st) {
                arr[res].end = Math.max(arr[res].end, arr[i].end);
                arr[res].st = Math.min(arr[res].st, arr[i].st);
            } else { 
                res++;
                arr[res] = arr[i];
            }
        }
        
        for (int i = 0; i <= res; i++)
            System.out.print(arr[i].st + " " + arr[i].end + " \n");
    }
    
    public static void main(String[] args) {
        Interval[] intervals = {
            new Interval(1, 3),
            new Interval(2, 6),
            new Interval(8, 10),
            new Interval(15, 18)
        };
        
        int n = intervals.length;
        mergeIntervals(intervals, n);
    }
}

//TIME = O(nlogn)