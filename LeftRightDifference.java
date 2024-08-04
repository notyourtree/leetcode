class Solution {
    public int[] leftRightDifference(int[] nums) {
        // left sum
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;
        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        int[] rightSum = new int[nums.length];
        rightSum[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }
}
