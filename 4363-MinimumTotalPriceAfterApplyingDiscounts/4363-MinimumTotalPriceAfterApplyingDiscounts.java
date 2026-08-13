// Last updated: 13/08/2026, 09:21:11
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double t=0;
        int n=prices.length;
        int m=discounts.length;
        for(int i=0;i<n;i++){
            int p=prices[n-1-i];
            if(i<m){
                int d=discounts[m-1-i];
                t+=p*(100.0-d)/100.0;
            }else{
                t+=p;
            }
        }
        return t;
    }
}