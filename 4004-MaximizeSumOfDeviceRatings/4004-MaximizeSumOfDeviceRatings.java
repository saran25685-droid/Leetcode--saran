// Last updated: 13/08/2026, 09:21:28
class Solution {
    public long maxRatings(int[][] units) {
        int m=units.length;
        long sum=0;
        int g=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            Arrays.sort(units[i]);
            g=Math.min(g,units[i][0]);
            if(units[i].length>1){
                sum += units[i][1];
                min = Math.min(min,units[i][1]);
            }else{
                sum+=units[i][0];
            min=Math.min(min,units[i][0]);}
        }
        return sum-min+g;
    }
}