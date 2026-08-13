// Last updated: 13/08/2026, 09:23:12
class Solution {
    public String truncateSentence(String s, int k) {
        int idx=0;
        int spaceCount=0;
        
        while(idx<s.length() && spaceCount<k){
            if(s.charAt(idx)==' ') spaceCount++;
            idx++;
        }
       
        return spaceCount==k?s.substring(0,idx-1):s;
    }
}