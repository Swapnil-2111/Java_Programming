import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums); // Ascending order

        // Create array to store unique values
        int[] store = new int[n];
        store[0] = nums[0];
        int j = 1; // counter for unique values

        // Remove duplicates
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                store[j++] = nums[i];
            }
        }

        // Now j = number of unique elements
        if (j == 1) {
            return store[0];
        }
        if (j == 2) {
            return store[1];
        }
        return store[j - 3]; // third maximum from end
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 3, 1};
        int ans = sol.thirdMax(nums);
        System.out.println("Third Max is: " + ans);
    }
}

