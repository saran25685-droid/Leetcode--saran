// Last updated: 13/08/2026, 09:23:43
class Solution {
    public int maxPower(String s) {
         int count =1;
        int max = 1;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}