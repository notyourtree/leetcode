class minSwapToGroupOnes {
    public int minSwaps(int[] nums) {
        // Find min swaps to group 0s and 1s, and return the minimum
        int swap0 = findMinSwaps(nums, 0);
        System.out.println(swap0);
        int swap1 = findMinSwaps(nums, 1);
        System.out.println(swap1);
        return Math.min(swap0, swap1);
    }

    public int findMinSwaps(int[] nums, int val) {
        // Sum the number of vals in the array. This is the window size.
        int totalVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                totalVal++;
            }
        }
        if (totalVal == 0 || totalVal == nums.length) {
            return 0;
        }
        // If there are 0 or nums.length-1, return 0

        // Start with a sliding window. initialize start, end, maxVal, currVal
        int start = 0; 
        int end = 0;
        int maxVal = 0;
        int currVal = 0;

        while (end < totalVal) {
            if (nums[end++] == val) currVal++;
        }
        maxVal = currVal;

        System.out.println("totalval = "  + totalVal);

        while (end < nums.length) {
            if (nums[start++] == val) currVal--;
            if (nums[end++] == val) currVal++;

            maxVal = Math.max(currVal, maxVal);
        }
        // if start = val, decrement currVal and start++
        // if end = val, incrememnt currVal and end++
        // update maxVal to be max of maxVal and currVal
        // return the maxVal
        return totalVal - maxVal;
    }
}
