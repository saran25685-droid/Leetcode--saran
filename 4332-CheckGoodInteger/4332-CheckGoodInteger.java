// Last updated: 13/08/2026, 09:21:26
class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0;
        int s=0;
        while(n>0){
            int a=n%10;
            d+=a;
            s+=a*a;
            n/=10;
        }
        return(s-d)>=50;
    }
}