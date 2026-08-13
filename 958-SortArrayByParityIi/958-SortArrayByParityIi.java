// Last updated: 13/08/2026, 09:35:24
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0){
               arr[start] = nums[i]; 
               start +=2;
            }else{
               arr[end] = nums[i];
                end-=2;
            }
        }
        return arr;
    }
}