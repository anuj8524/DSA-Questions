class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<=3){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            int diff=nums[n-3+i]-nums[i];
            min=Math.min(min,diff);
        }
        return min;
    }
}