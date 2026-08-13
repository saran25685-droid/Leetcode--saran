// Last updated: 13/08/2026, 09:22:38
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int p=0,q=0;
            int j=i;
            while(j<n)
            {
                if(s.charAt(j)=='0')
                {
                    p++;
                }
                if(s.charAt(j)=='1')
                {
                    break;
                }
                j++;
            }
            int k=j;
            while(k<n)
            {
                if(s.charAt(k)=='1')
                {
                    q++;
                }
                if(s.charAt(k)=='0')
                {
                    break;
                }
                if(p==q)
                {
                    c=Math.max(c,(k-i+1));
                }
                k++;
            }
        }
        return c;
    }
}