class Solution {
    public int minMoves(int[] nums) {
       int s=0,m=nums[0];
       for(int i=0;i<nums.length;i++)
       {
        s+=nums[i];
        if(nums[i]>m)m=nums[i];
       }
       return m*nums.length-s;
    }
}