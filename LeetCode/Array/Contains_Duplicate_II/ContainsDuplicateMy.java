class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    if (j - i <= k) {
                        System.out.println("Duplicate element " + nums[i] + " found at indices " + i + " and " + j);
                        flag = true;
                        return true; // You can directly return true here
                    }
                }
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = sol.containsNearbyDuplicate(nums, k);
        System.out.println("Result: " + result);
    }
}

