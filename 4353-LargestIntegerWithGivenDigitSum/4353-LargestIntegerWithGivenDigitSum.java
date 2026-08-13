// Last updated: 13/08/2026, 09:21:10
class Solution {
    public int largestInteger(int n, int s) {
  if(s>9*n){
      return -1;
  }
  StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s>=9){
                ans.append(9);
                s-=9;
            }else{
                ans.append(s);
                s=0;
            }
        }
        int i=0;
        while(i<ans.length()-1&&ans.charAt(i)=='0'){
            i++;
        }
        return Integer.parseInt(ans.substring(i));
    }
}