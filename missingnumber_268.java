class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1]; // Declare and initialize hash array

        for (int i = 0; i < n; i++) {
            hash[nums[i]] = 1;
        }

        for (int i = 0; i <= n; i++) {
            if (hash[i] == 0)
                return i;
        }

        return -1; // Should never be reached if input is valid
    }
}
