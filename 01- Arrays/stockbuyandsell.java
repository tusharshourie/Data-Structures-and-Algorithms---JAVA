//BUY WHEN STOCK PRICE IS LEAST AND SELL WHEN PRICE IS MORE FOR MAX PROFIT
public class stockbuyandsell {
    static int maxProfit(int price[], int n){
        int profit = 0;
        for(int i=1; i<n; i++)
            if(price[i]>price[i-1])
                profit += (price[i]-price[i-1]);
        return profit;
    }
    public static void main(String[] args) {
        int price[] = {1, 5, 3, 8, 12};
        int n=5;
        System.out.println(maxProfit(price, n));
    }
}

// i=1  profit =0 +(5-1)=4
// i=2:
// i=3: profit = 4+(8-3)=9
// i=4: profit = 9+(12-8)=13    