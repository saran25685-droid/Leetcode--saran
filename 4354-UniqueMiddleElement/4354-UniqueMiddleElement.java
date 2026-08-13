// Last updated: 13/08/2026, 09:21:13
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int m=nums[nums.length/2];
        int c=0;
        for(int num:nums){
            if(num==m){
                c++;
            }
        }
        if(c==1){
            return true;
        }
        return false;
    }
}