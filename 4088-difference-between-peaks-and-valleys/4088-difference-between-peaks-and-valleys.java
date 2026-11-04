class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;
        int peak=0;
        int valley=0;
        for (int i = 1;i<n - 1;i++) {
            if (nums[i]>nums[i-1]&&nums[i]>nums[i+1]) {
                peak += nums[i];
            }
        }
        for (int j = 1;j<n-1;j++) {
            if (nums[j]<nums[j - 1]&& nums[j]<nums[j+1]) {
                valley += nums[j];
            }
        }

        return peak-valley;
    }
}