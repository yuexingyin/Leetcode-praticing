/**
 * Created by YuexingYin on 10/11/16.
 */
public class BestBuyStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > profit){
                profit = prices[i]-minPrice;
            }
        }
        return profit;
    }
}
