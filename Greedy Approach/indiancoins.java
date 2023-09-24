/* We are given infinite supply of denominations [1,2,5,10,20,50,100,500,2000]
 * Find min no of coins/notes to make change for a value V
 */

/* V=121
    ans= 3(100,20,1)
 */

/* V=590
 * ans=4(500,50,20,20)
 */


import java.util.*;
public class indiancoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        
        Arrays.sort(coins, Comparator.reverseOrder());

        int countofCoins=0;
        int amount=590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countofCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }

        System.out.println("Total min coins used = " + countofCoins);
       
        System.out.println("Coins used: ");
        for(int i=0; i<ans.size(); i++){
        System.out.println(ans.get(i));
        }
    }
}

//O()