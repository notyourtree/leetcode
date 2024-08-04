class RangeSum {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> sums = new ArrayList<>();
        
        // Brute force approach
        // O(N^2) iterate over all subarrays and sum.
        // Add to an array
        // Sort with Collections.sort. O(M log M) where M = N * (N + 1) / 2
        // Total time: O(N^2 + M log M) = O(N^2 + n^2 log n^2)
        
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                sums.add(sum);
            }
        }

        Collections.sort(sums);

        int modulo = (int) 1e9 + 7;
        int result = sums.get(left - 1) % modulo;
        for (int i = left; i < right; i++) {
            result = (result + sums.get(i)) % modulo;
        }

        return result;
    }
}
