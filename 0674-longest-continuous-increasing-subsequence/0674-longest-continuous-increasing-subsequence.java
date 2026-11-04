class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=1;
        int max=1;
        int count =1;
        while (right<n){
            if (nums[left]<nums[right]){
                count ++;
            }
            else{
                count =1;
            }
            max=Math.max(max,count);
            left++;
            right++;

        }
        return max;

    }
}