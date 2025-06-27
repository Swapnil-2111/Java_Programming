import java.util.Scanner;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        return helper(nums, target, 0);
    }

    // Helper method to perform recursion with index tracking
    private int[] helper(int[] nums, int target, int index) {
        int n = nums.length;

        // Base Case
        if (index >= n - 1) {
            return new int[] {}; // Not found
        }

        // Check with all elements after current index
        for (int j = index + 1; j < n; j++) {
            if (nums[index] + nums[j] == target) {
                return new int[] {index, j};
            }
        }

        // Recursive call with next index
        return helper(nums, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " elements in the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the Target: ");
        int target = sc.nextInt();

        Solution so = new Solution();
        int[] result = so.twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        }
    }
}
