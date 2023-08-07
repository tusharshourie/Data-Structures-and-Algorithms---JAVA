public class majorityelementinarray {
    static int findMajority(int arr[], int n) {
        int res = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i])
                count++;
        }
        if (count <= n / 2)
            res = -1;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 8, 6, 6, 6, 4, 6 };
        int n = arr.length;
        int result = findMajority(arr, n);
        if (result != -1)
            System.out.println("Majority Element: " + arr[result]);
        else
            System.out.println("No majority element found.");
    }
}
//majority ele= ele that occurs more than n/2 times